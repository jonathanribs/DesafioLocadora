public class Onibus extends Veiculo{

    private int assentos;

    public Onibus(String placa) {
        
        super(placa, "Onibus");

        boolean validado = false;
        while(!validado) {
            try {
                System.out.println("\nNumero de assentos: ");
                this.assentos = in.nextInt();
                validado = true;
            } catch (Exception e) {
                System.out.println("NUMERO INVALIDO!");
                in.nextLine();
            }
        }
        
    }
    
    public int getAssentos(){
        return this.assentos;
    }

    public boolean validaCNH(String cnh){
        if (cnh.equals("D")){
            return true;
        } else {
            return false;
        }
    }

    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println(this.assentos + " lugares \n");
    }

}