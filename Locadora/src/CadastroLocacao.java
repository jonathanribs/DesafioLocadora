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

    public boolean encerrarLocacao(String placa){

        for (Locacao l : locacao){

            if (l.getPlaca().equals(placa)){
                this.locacao.remove(l);

                return true;
            }
        }

        return false;

    }
    
}


/*arrumar prints e colocar o carro novamente disponivel*/