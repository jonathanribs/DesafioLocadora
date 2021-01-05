public class Carro extends Veiculo{

    private int portas;
    private boolean arCondicionado;
    private String cambio;
    private String direcao;

    public Carro(String placa, String marca, int ano, String cor, int p, boolean a, String c, String d) {
        
        super(placa, marca, ano, cor, 'B');
        this.portas = p;
        this.arCondicionado = a;
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

}
