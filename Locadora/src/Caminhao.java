public class Caminhao extends Veiculo{

    private int capacidade;

    public Caminhao(String placa) {
        
        super(placa, "Caminhao");

        boolean validado = false;
        while(!validado) {
            try {
                System.out.println("\nCapacidade de Carga (em toneladas): ");
                this.capacidade = in.nextInt();
                validado = true;
            } catch (Exception e) {
                System.out.println("NUMERO INVALIDO!");
                in.nextLine();
            }
        }
        
    }
    
    public int getCapacidade(){
        return this.capacidade;
    }

    public boolean validaCNH(String cnh){
        if (cnh.equals("C") || cnh.equals("D")){
            return true;
        } else {
            return false;
        }
    }

    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println(this.capacidade + " toneladas \n");
    }

}