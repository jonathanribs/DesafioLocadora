public class Moto extends Veiculo{

    private int cilindradas;

    public Moto(String placa, String marca, int ano, String cor, int c) {
        
        super(placa, marca, ano, cor, 'A');
        this.cilindradas = c;
        
    }
    
    public int getCilindradas(){
        return this.cilindradas;
    }

}