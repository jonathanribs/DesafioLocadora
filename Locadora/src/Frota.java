import java.util.ArrayList;

public class Frota {

    public ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void novoVeiculo(Veiculo veiculo){
        
        veiculos.add(veiculo);

    }

    public void imprimeVeiculos(){

        //Chama o método especifico de cada veiculo para imprimir sua descrição completa
        System.out.println("VEICULOS");
        for (Veiculo v : veiculos){
            v.imprimirAtributos();
        }

    }

    public int buscarVeiculo(String placa){

        //Busca na lista de veiculos aquele que corresponde a placa procurada
        //Retorna o index do veiculo na lista. Retorna -1 se a placa não existir entre os veiculos cadastrados
        for(Veiculo v: veiculos){
            if (v.getPlaca().equals(placa)){
                return veiculos.indexOf(v); 
            }
        }
        
        return -1;
    }
        
}
