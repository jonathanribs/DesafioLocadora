public class Onibus extends Veiculo{

    private int assentos;

    public Onibus(String placa, String marca, int ano, String cor, int c) {
        
        super(placa, marca, ano, cor, 'D');
        this.assentos = c;
        
    }
    
    public int getAssentos(){
        return this.assentos;
    }

}