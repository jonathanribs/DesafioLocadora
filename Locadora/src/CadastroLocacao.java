import java.time.LocalDate;
import java.util.ArrayList;

public class CadastroLocacao {

    public ArrayList<Locacao> locacao = new ArrayList<>();

    public void adicionarLocacao(Locacao locacao){
        
        this.locacao.add(locacao);

    }

    public void imprimeLocacoes(){

        for (Locacao l : locacao){

            System.out.println("\n" + l.getPlaca());
            System.out.println(l.getTelefone());

        }

    }

    public boolean encerrarLocacao(String placa, Frota frota){

        for (Locacao l : locacao){

            if (l.getPlaca().equals(placa)){
                this.locacao.remove(l);

                int index = frota.buscarVeiculo(placa);
                frota.veiculos.get(index).setDisponibilidade(true);
                System.out.println("Locacao do veiculo placa " + placa + " encerrada com sucesso!");

                return true;
            }
        }

        System.out.println("Não ha veiculo locado com esta placa!");
        return false;  

    }

    public void locacaoVencida(LocalDate data){
        for (Locacao l : locacao){

            if (data.isAfter(l.getData())){
                System.out.println("Locacao do veiculo de placa " + l.getPlaca() + " esta vencida! \n");
            }

        }
    }
    
}
