import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        Frota frota = new Frota();

        Utilities utils = new Utilities();

        String opt = "";
        while (!opt.equals("X")){

            System.out.println("(C) Cadastrar Veiculo \n(L) Nova Locacao \n(X) Encerrar");
            opt = in.next().toUpperCase();

            if (opt.equals("C")){
                
                utils.cadastrarVeiculo(frota);

            } else if (opt.equals("L")){

                frota.imprimeVeiculos();

            }

            System.out.println();

        }

        in.close();
    }
}
