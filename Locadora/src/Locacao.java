public class Locacao {

    private String placa;
    private String telefone;
    //data

    public Locacao (String placa, String telefone){
        this.placa = placa;
        this.telefone = telefone;
    }

    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}