public abstract class Veiculo {

    private String placa;
    private String marca;
    private int ano;
    private String cor;
    private boolean disponivel;
    private char tipo;

    public Veiculo (String placa, String marca, int ano, String cor, char tipo){

        //testar aqui se a placa já existe. Varrer o Array Frota para conferir isto
        //se a placa já existir, imprimir mensagem de erro, só cadastrar se não existir

        /* System.out.println("Informe a placa:")" */
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

    public char getTipo(){//TRANSFORMAR EM ABSTRATO PARA RETORNAR "MOTO/CARRO/CAMINHAO/ONIBUS"
        return this.tipo;
    }

}
