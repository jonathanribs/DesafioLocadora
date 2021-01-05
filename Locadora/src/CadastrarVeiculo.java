import java.util.Scanner;

public class CadastrarVeiculo {

    Frota frota = new Frota();
    Scanner in = new Scanner(System.in);

    public void cadastro(){
        String opt = "";
        while (!opt.equals("X")){

            System.out.println("(A) Moto \n(B)Carro \n(C)Caminhao \n(D)Onibus \n(X)Cancelar");
            opt = in.next().toUpperCase();

            if (opt.equals("A")){
                Moto veiculo = new Moto("hmv2786", "ford", 2010, "azul", 4);
                frota.novoVeiculo(veiculo);
                opt = "X";
            }else if (opt.equals("B")){
                Carro veiculo = new Carro("hmv2786", "ford", 2010, "azul", 4, true, "Auto", "Hidro");
                frota.novoVeiculo(veiculo);
                opt = "X";
            } else if (opt.equals("C")){
                Caminhao veiculo = new Caminhao("hmv2786", "ford", 2010, "azul", 4);
                frota.novoVeiculo(veiculo);
                opt = "X";
            } else if (opt.equals("D")){
                Onibus veiculo = new Onibus("hmv2786", "ford", 2010, "azul", 4);
                frota.novoVeiculo(veiculo);
                opt = "X";
            } 

        }
    }
}
