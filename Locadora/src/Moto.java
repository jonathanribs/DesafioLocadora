public class Moto extends Veiculo{

    private int cilindradas;

    public Moto(String placa, String marca, int ano, String cor, int c) {
        
        super(placa, marca, ano, cor, "Moto");
        this.cilindradas = c;
        
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

}