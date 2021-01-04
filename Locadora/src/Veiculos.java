public abstract class Veiculos {

    private String placa;
    private String marca;
    private int ano;
    private String cor;
    private boolean disponivel;

    public Veiculos (String placa, String marca, int ano, String cor){

        //testar aqui se a placa já existe. Varrer o Array Frota para conferir isto
        //se a placa já existir, imprimir mensagem de erro, só cadastrar se não existir
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.disponivel = true;
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
    public void getCor(String cor){
        this.cor = cor;
    }

    public boolean getDisponibilidade(){
        return disponivel;
    }
    public void setDisponibilidade(boolean disponivel){
        this.disponivel = disponivel;
    }
}
