import java.time.LocalDate;
import java.util.ArrayList;

public class CadastroLocacao {

    public ArrayList<Locacao> locacao = new ArrayList<>();

    public void adicionarLocacao(Locacao locacao){
        
        this.locacao.add(locacao);

    }

    public void imprimeLocacoes(){

        for (Locacao l : locacao){

            System.out.println("\nVeiculo placa: " + l.getPlaca());
            System.out.println("Whatsapp do locador: " + l.getTelefone());
            System.out.println("Data limite: " + l.getData());

        }

    }

    public boolean encerrarLocacao(String placa, Frota frota){

        for (Locacao l : locacao){

            if (l.getPlaca().equals(placa)){
                this.locacao.remove(l);

                int index = frota.buscarVeiculo(placa);
                frota.veiculos.get(index).setDisponibilidade(true);
                System.out.println("Locacao do veiculo placa " + placa + " foi encerrada! \n");

                return true;
            }
        }

        System.out.println("Não ha veiculo locado com esta placa!");
        return false;  

    }

    public void locacaoVencida(LocalDate dataAtual, Frota frota){
        
        ArrayList<String> placasVencidas = new ArrayList<>();

        for (Locacao l : locacao){

            if (dataAtual.isAfter(l.getData())){
                System.out.println("Locacao do veiculo de placa " + l.getPlaca() + " esta vencida! \n");
                placasVencidas.add(l.getPlaca());
            }

        }

        for (String p : placasVencidas){
            this.encerrarLocacao(p, frota);
        }

    }
    
}
