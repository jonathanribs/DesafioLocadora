public class Carro extends Veiculo{

    private int portas;
    private boolean arCondicionado;
    private String cambio;
    private String direcao;

    public Carro(String placa, String marca, int ano, String cor, int p, boolean a, String c, String d) {
        
        super(placa, marca, ano, cor, "Carro");
        this.portas = p;
        this.arCondicionado = a;
        //sysout ("o carro possui ar? (1)s (2) n")... if... this.arCondicionado = boolean
        this.cambio = c;
        this.direcao = d;
        
    }
    
    public int getPortas(){
        return this.portas;
    }

    public boolean getArCondicionado(){
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

}
