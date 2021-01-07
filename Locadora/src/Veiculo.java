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

        this.placa = placa;

        System.out.println("\nInforme a marca: ");
        this.marca = in.nextLine();

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

    public abstract boolean validaCNH(String cnh);

    public void imprimirAtributos(){
        System.out.println("Placa: " + this.getPlaca() + ", " + this.getTipo() + " ano " + 
            this.getAno() + " " + this.getCor() + " da marca " + this.getMarca());
    }

}
