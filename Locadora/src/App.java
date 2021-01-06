import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        Frota frota = new Frota();
        CadastroLocacao locacoes = new CadastroLocacao();

        Utilities utils = new Utilities();

        String opt = "";
        while (!opt.equals("X")){

            System.out.println("(C) Cadastrar Veiculo \n(V) Visualizar Frota \n(N) Nova Locacao"+ 
            "\n(E) Encerrar Locacoes \n(L) Visualizar Locacoes \n(X) Encerrar\n");
            opt = in.next().toUpperCase();

            if (opt.equals("C")){
                
                utils.cadastrarVeiculo(frota);

            } else if (opt.equals("V")){
                
                frota.imprimeVeiculos();   

            } else if (opt.equals("N")){

                String placa = "";

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
            } else if (opt.equals("E")){

                String placa = "";
                System.out.println("Informe a placa do veiculo");
                placa = in.next().toUpperCase();

                locacoes.encerrarLocacao(placa, frota);  

            }
            //Criar uma opção de alterar data manualmente
            //quando acontecer, varrer o vertor de cadastroLocacao comparando com o atributo data (que tmb deve ser add)
            //se a data for maior, remover a locacao e imprimir uma mensagem
            //A primeira coisa é criar a função que encerra determinada locacao a partir da placa

            System.out.println();

        }

        in.close();
    }
}
