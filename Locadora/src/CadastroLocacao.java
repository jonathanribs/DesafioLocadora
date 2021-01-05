import java.util.ArrayList;

public class CadastroLocacao {

    public ArrayList<Locacao> locacao = new ArrayList<>();

    public void novaLocacao(Locacao locacao){
        
        this.locacao.add(locacao);

    }

    public void imprimeLocacoes(){

        for (Locacao l : locacao){
            System.out.println("\n" + l.getPlaca());
            System.out.println(l.getTelefone());
        }

    }
    
}