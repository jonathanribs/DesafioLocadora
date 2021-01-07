import java.util.Scanner;

public class Utilities {

    Scanner in = new Scanner(System.in);

    public Frota cadastrarVeiculo (Frota frota){

        String opt = "";

        String novaPlaca = "";
        System.out.println("Digite a placa: ");
        novaPlaca = in.next().toUpperCase();

        boolean placaUnica = true;
        for (Veiculo v: frota.veiculos){
            if (v.getPlaca().equals(novaPlaca)){
                    placaUnica = false;
            }
        }

        if (!placaUnica){
            System.out.println("Essa placa já existe!");
        } else {
            while (!opt.equals("X")){
                System.out.println("\n(A) Moto \n(B) Carro \n(C) Caminhao \n(D) Onibus \n(X) Cancelar");
                opt = in.next().toUpperCase();

                if (opt.equals("A")){

                    Moto veiculo = new Moto(novaPlaca);
                    frota.novoVeiculo(veiculo);
                    opt = "X";

                }else if (opt.equals("B")){

                    Carro veiculo = new Carro(novaPlaca);
                    frota.novoVeiculo(veiculo);
                    opt = "X";

                } else if (opt.equals("C")){

                    Caminhao veiculo = new Caminhao(novaPlaca);
                    frota.novoVeiculo(veiculo);
                    opt = "X";

                } else if (opt.equals("D")){

                    Onibus veiculo = new Onibus(novaPlaca);
                    frota.novoVeiculo(veiculo);
                    opt = "X";

                } 
            }

        }

        return frota;

    }

    public void novaLocacao (CadastroLocacao cadastroLocacao, Veiculo veiculoLocado){

        String cnh = "";

        System.out.println("Qual a categoria da CNH? ");
        cnh = in.next().toUpperCase();
        if (veiculoLocado.validaCNH(cnh)){

            String placa = veiculoLocado.getPlaca();
            Locacao locacao = new Locacao(placa);
            cadastroLocacao.adicionarLocacao(locacao);

            veiculoLocado.setDisponibilidade(false);

        } else {
            System.out.println("Você não esta apto para dirigir este tipo de veiculo!");
        }
        
    }
}
