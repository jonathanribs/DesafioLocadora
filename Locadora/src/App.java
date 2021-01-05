import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        
        Carro carro = new Carro("hmv2786", "ford", 2010, "azul", 4, true, "Auto", "Hidro");

        System.out.println(carro.getTipo());
        System.out.println(carro.getPlaca());
        System.out.println(carro.getDisponibilidade());

        Frota frota = new Frota();

        frota.novoVeiculo(carro);

        CadastrarVeiculo c = new CadastrarVeiculo();

        String opt = "";
        while (!opt.equals("X")){

            System.out.println("(C) Cadastrar Veiculo \n(L)Nova Locacao \n(X) Encerrar");
            opt = in.next().toUpperCase();

            if (opt.equals("C")){
                
                c.cadastro();

            } else if (opt.equals("L")){
            }

        }

        in.close();
    }
}
