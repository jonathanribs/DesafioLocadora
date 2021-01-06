import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        Frota frota = new Frota();
        CadastroLocacao locacoes = new CadastroLocacao();

        Utilities utils = new Utilities();

        String opt = "";
        while (!opt.equals("X")){

            System.out.println("(C) Cadastrar Veiculo \n(N) Nova Locacao \n(L) Visualizar Locacoes \n(X) Encerrar\n");
            opt = in.next().toUpperCase();

            if (opt.equals("C")){
                
                utils.cadastrarVeiculo(frota);

            } else if (opt.equals("N")){

                String placa = "";

                System.out.println("VEICULOS");
                frota.imprimeVeiculos();
                System.out.println("Digite a placa do veiculo que sera locado: ");
                placa = in.next().toUpperCase(); 

                int index = frota.buscarVeiculo(placa);
                if(index == -1){
                    
                    System.out.println("Placa não encontrada!");

                } else {
                    
                    Veiculo veiculoLocado = frota.veiculos.get(index);

                    if (veiculoLocado.getDisponibilidade()){
                        
                        utils.novaLocacao(locacoes,veiculoLocado);

                    } else {
                        
                        System.out.println("Veiculo não esta disponivel!");

                    }
                    
                }

            } else if (opt.equals("L")){ 
                locacoes.imprimeLocacoes();
            }

            System.out.println();

        }

        in.close();
    }
}
