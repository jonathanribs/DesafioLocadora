import java.util.ArrayList;

public class Frota {

    public ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void novoVeiculo(Veiculo veiculo){
        
        veiculos.add(veiculo);

    }

    public void imprimeVeiculos(){

        System.out.println("VEICULOS");
        for (Veiculo v : veiculos){
            v.imprimirAtributos();
        }

    }

    public int buscarVeiculo(String placa){
        for(Veiculo v: veiculos){
            if (v.getPlaca().equals(placa)){
                return veiculos.indexOf(v); // retorna o index do veiculo que possui a placa indicada
            }
        }
        
        return -1; //Retorna -1 se a placa não existir
    }
        
}
