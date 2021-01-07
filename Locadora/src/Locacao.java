import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

public class Locacao {

    private String placa;
    private String telefone;
    public LocalDate data;

    public Locacao (String placa, String telefone, String data){
        this.placa = placa;
        this.telefone = telefone;
        //this.data = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.data = LocalDate.parse(data);
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

    public LocalDate getData(){
        return this.data;
    }
    public void setData(String data){
        this.data = LocalDate.parse(data);
    }

}