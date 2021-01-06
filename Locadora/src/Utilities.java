import java.util.Scanner;

public class Utilities {

    Scanner in = new Scanner(System.in);

    public Frota cadastrarVeiculo (Frota frota){

        String opt = "";
        while (!opt.equals("X")){

            System.out.println("\n(A) Moto \n(B) Carro \n(C) Caminhao \n(D) Onibus \n(X) Cancelar");
            opt = in.next().toUpperCase();

            if (opt.equals("A")){

                Moto veiculo = new Moto("a1", "honda", 2010, "vermelha", 125);
                frota.novoVeiculo(veiculo);
                opt = "X";

            }else if (opt.equals("B")){

                Carro veiculo = new Carro("a2", "fiat", 2011, "prata", 4, true, "Auto", "Hidro");
                frota.novoVeiculo(veiculo);
                opt = "X";

            } else if (opt.equals("C")){

                Caminhao veiculo = new Caminhao("a3", "ford", 2012, "branco", 10);
                frota.novoVeiculo(veiculo);
                opt = "X";

            } else if (opt.equals("D")){

                Onibus veiculo = new Onibus("a4", "mercedes", 2013, "azul", 40);
                frota.novoVeiculo(veiculo);
                opt = "X";

            } 

        }

        return frota;

    }

    public CadastroLocacao novaLocacao (CadastroLocacao cadastroLocacao, Veiculo veiculoLocado){

        String telefone = "";
        String cnh = "";

        System.out.println("Qual a categoria da CNH? ");
        cnh = in.next().toUpperCase();
        if (veiculoLocado.validaCNH(cnh)){

            System.out.println("Telefone para contato: ");
            telefone = in.next();

            String placa = veiculoLocado.getPlaca();
            Locacao locacao = new Locacao(placa, telefone);
            cadastroLocacao.novaLocacao(locacao);

        } else {
            System.out.println("Você não está apto para dirigir este tipo de veiculo");
        }
        
        return cadastroLocacao;
    }
}
