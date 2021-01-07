import java.util.Scanner;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        Frota frota = new Frota(); //Armazena os Veiculos Cadastrados
        CadastroLocacao locacoes = new CadastroLocacao(); //Armazena as Locacoes Ativas

        Utilities utils = new Utilities(); //Possui as funções de cadastrar novo veiculo e cadastrar nova locação

        String opt = "";
        while (!opt.equals("X")){ //O Programa irá rodar enquanto o usuário não selecionar para sair

            //Sempre que o programa iniciar, confere se ha alguma locacao vencida antes de gerar o Menu Principal
            LocalDate dataAtual = LocalDate.now();
            locacoes.locacaoVencida(dataAtual, frota); //o metodo encerra automaticamente as locações que passaram da data

            //Menu Principal
            System.out.println("(C) Cadastrar Veiculo \n(V) Visualizar Frota \n(N) Nova Locacao"+ 
            "\n(E) Encerrar Locacoes \n(L) Visualizar Locacoes \n(X) Encerrar\n");
            opt = in.next().toUpperCase();

            if (opt.equals("C")){
                
                utils.cadastrarVeiculo(frota);

            } else if (opt.equals("V")){
                
                frota.imprimeVeiculos(); //Imprime a lista de veiculso cadastrados 

            } else if (opt.equals("N")){ //Cadastra nova locação

                String placa = "";

                System.out.println("Digite a placa do veiculo que sera locado: ");
                placa = in.next().toUpperCase(); 

                int index = frota.buscarVeiculo(placa); //A função retorna o index que o veiculo escolhido possui dentro da lista "frota"
                if(index == -1){ //Controle caso o usuario tente buscar uma placa que não existe entre os veiculos da frota
                    
                    System.out.println("Placa não encontrada!");

                } else {
                    
                    Veiculo veiculoLocado = frota.veiculos.get(index);

                    if (veiculoLocado.getDisponibilidade()){ //Só realiza a locação se o carro estiver disponível, ou seja, não estiver alugado para outra pessoa
                        
                        utils.novaLocacao(locacoes,veiculoLocado); 

                    } else {
                        
                        System.out.println("Veiculo não esta disponivel!");

                    }
                    
                }

            } else if (opt.equals("L")){ 
                
                locacoes.imprimeLocacoes(); //Imprime a lista de todas as locações ativas

            } else if (opt.equals("E")){ //Encerra uma locação manualmente

                String placa = "";
                System.out.println("Informe a placa do veiculo");
                placa = in.next().toUpperCase();

                locacoes.encerrarLocacao(placa, frota);  

            }

            System.out.println();

        }

        in.close();
    }
}
