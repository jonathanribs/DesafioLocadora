public class Carro extends Veiculo{

    private int portas;
    private String arCondicionado;
    private String cambio;
    private String direcao;

    public Carro(String placa){
        
        super(placa,"Carro");

        boolean validado = false;
        while(!validado) {
            try {
                System.out.println("\nNumero de portas: ");
                this.portas = in.nextInt();
                validado = true;
            } catch (Exception e) {
                System.out.println("NUMERO INVALIDO!");
                in.nextLine();
            }
        }

        String opt = "";

        while (!(opt.equals("SIM") || (opt.equals("NAO")))){
            System.out.println("\nAr Condicionado: \n(Sim) \n(Nao)\n");
            opt=in.next().toUpperCase();
        }
        this.arCondicionado = opt;
        opt = "";

        while (!(opt.equals("MANUAL") || (opt.equals("AUTOMATICO")))){
            System.out.println("\nCambio: \n(Manual) \n(Automatico)\n");
            opt=in.next().toUpperCase();
        }
        this.cambio = opt;
        opt = "";

        while (!(opt.equals("MECANICA") || (opt.equals("HIDRAULICA")) || (opt.equals("ELETRICA")))){
            System.out.println("\nDirecao: \n(Mecanica) \n(Hidraulica) \n(Eletrica)\n");
            opt=in.next().toUpperCase();
        }
        this.direcao = opt;
        
    }
    
    public int getPortas(){
        return this.portas;
    }

    public String getArCondicionado(){
        return this.arCondicionado;
    }

    public String getCambio(){
        return this.cambio;
    }

    public String getDirecao(){
        return this.direcao;
    }    

    public boolean validaCNH(String cnh){
        if (cnh.equals("B") || cnh.equals("C") || cnh.equals("D")){
            return true;
        } else {
            return false;
        }
    }

    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println(this.portas + " portas, câmbio " + this.cambio + ", direção " + 
        this.direcao + ", ar-condicionado: " + this.arCondicionado +"\n");
    }

}
