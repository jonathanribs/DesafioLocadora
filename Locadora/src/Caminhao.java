public class Caminhao extends Veiculo{

    private int capacidade;

    public Caminhao(String placa, String marca, int ano, String cor, int c) {
        
        super(placa, marca, ano, cor, 'C');
        this.capacidade = c;
        
    }
    
    public int getCapacidade(){
        return this.capacidade;
    }

}