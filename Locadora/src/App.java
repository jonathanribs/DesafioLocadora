import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        Frota frota = new Frota();
        CadastroLocacao locacoes = new CadastroLocacao();

        Utilities utils = new Utilities();

        String opt = "";
        while (!opt.equals("X")){

            System.out.println("(C) Cadastrar Veiculo \n(L) Nova Locacao \n(X) Encerrar\n");
            opt = in.next().toUpperCase();

            if (opt.equals("C")){
                
                utils.cadastrarVeiculo(frota);

            } else if (opt.equals("L")){

                String placa = "";

                System.out.println("VEICULOS DISPONIVEIS");
                frota.imprimeVeiculos();
                System.out.println("Digite a placa do veiculo que sera locado: ");
                placa = in.next();

                utils.novaLocacao(locacoes,placa);

            } else if (opt.equals("Z")){ //apenas para teste
                locacoes.imprimeLocacoes();
            }

            System.out.println();

        }

        in.close();
    }
}
