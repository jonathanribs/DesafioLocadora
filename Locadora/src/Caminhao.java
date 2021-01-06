public class Caminhao extends Veiculo{

    private int capacidade;

    public Caminhao(String placa, String marca, int ano, String cor, int c) {
        
        super(placa, marca, ano, cor, "Caminhao");
        this.capacidade = c;
        
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