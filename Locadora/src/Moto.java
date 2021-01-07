public class Moto extends Veiculo{

    private int cilindradas;

    public Moto(String placa) {
        
        super(placa,"Moto");

        boolean validado = false;
        while(!validado) {
            try {
                System.out.println("\nCilindradas: ");
                this.cilindradas = in.nextInt();
                validado = true;
            } catch (Exception e) {
                System.out.println("NUMERO INVALIDO!");
                in.nextLine();
            }
        }
        
    }
    
    public int getCilindradas(){
        return this.cilindradas;
    }

    public boolean validaCNH(String cnh){
        if (cnh.equals("A")){
            return true;
        } else {
            return false;
        }
    }
    
    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println(this.cilindradas + "cc \n");
    }

}