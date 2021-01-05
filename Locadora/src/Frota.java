import java.util.ArrayList;

public class Frota {

    public ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void novoVeiculo(Veiculo veiculo){
        
        veiculos.add(veiculo);

    }

    public void imprimeVeiculos(){

        for (Veiculo v : veiculos){
            System.out.println(v.getPlaca());
            System.out.println(v.getTipo());
            System.out.println(v.getMarca());
            System.out.println(v.getCor() + "\n");
        }

    }
    
}
