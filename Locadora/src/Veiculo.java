import java.util.Scanner;

public abstract class Veiculo {

    private String placa;
    private String marca;
    private int ano;
    private String cor;
    private boolean disponivel;
    private String tipo;

    Scanner in = new Scanner(System.in);

    public Veiculo (String placa, String tipo){

        //Somente a placa é passada externamente. O tipo é passado automaticamente pelas classes filhas
        //Cada Veiculo implementa sua propria entrada de dados especificos
        //Sempre que um novo veiculo é cadastrado, ele é considerado disponivel para locacao

        this.placa = placa;

        System.out.println("\nInforme a marca: ");
        this.marca = in.nextLine();

        //O código abaixo garante que o usuário informe o ano em formato Inteiro
        boolean validado = false;
        while(!validado) {
            try {
                System.out.println("\nInforme o ano: ");
                this.ano = in.nextInt();

                validado = true;
            } catch (Exception e) {
                System.out.println("ANO INVALIDO!");
                in.nextLine(); //Consome o "enter" dado após ser informado o valor invalido. Se não for consumido, o sistema entra em loop
            }
        }
        /*while(!validado) { //OUTRA FORMA DE FAZER SEM ENTRAR EM LOOP
            System.out.println("Informe o ano: ");
            String a = in.nextLine();
            try {
                this.ano = Integer.parseInt(a);
                validado = true;
            } catch (Exception e) {
                System.out.println("Ano Invalido!\n");
            }
        }*/

        System.out.println("\nInforme a cor: ");
        this.cor = in.next(); 
        
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

    //Exige a criação de metodo especifico para validação de CNH em cada um dos filhos
    public abstract boolean validaCNH(String cnh);

    public void imprimirAtributos(){
        System.out.println("Placa: " + this.getPlaca() + ", " + this.getTipo() + " ano " + 
            this.getAno() + " " + this.getCor() + " da marca " + this.getMarca());
    }

}
