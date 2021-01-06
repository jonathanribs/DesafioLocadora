public abstract class Veiculo {

    private String placa;
    private String marca;
    private int ano;
    private String cor;
    private boolean disponivel;
    private String tipo;

    public Veiculo (String placa, String marca, int ano, String cor, String tipo){

        /* System.out.println("Informe a placa:");
        this.placa = in.next();
        System.out.println("Informe a marca:")
        this.marca = in.next();
        System.out.println("Informe o ano:")
        this.ano = in.next();
        System.out.println("Informe a cor:")
        this.cor = in.next();
        
        */
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.disponivel = true;
        this.tipo = tipo;

    }
    
    public String getPlaca(){
        return placa;
    }

    public String getMarca(){
        return marca;
    }

    public int getAno(){
        return ano;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public boolean getDisponibilidade(){
        return disponivel;
    }
    public void setDisponibilidade(boolean disponivel){
        this.disponivel = disponivel;
    }

    public String getTipo(){
        return this.tipo;
    }

    public abstract boolean validaCNH(String cnh);

}
