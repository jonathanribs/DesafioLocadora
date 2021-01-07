import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Locacao {

    private String placa;
    private String telefone;
    public LocalDate data;

    Scanner in = new Scanner(System.in);

    public Locacao (String placa){

        this.placa = placa;
        
        System.out.println("Telefone para contato: ");
        this.telefone = in.next();

        this.setData();

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
    public void setData(){

        boolean validado = false;
        while(!validado) {
            try {

                String dataFinal = "";
                System.out.println("Data de termino da locacao (yyyy-mm-dd): ");
                dataFinal = in.next();

                this.data = LocalDate.parse(dataFinal);

                validado = true;

            } catch (DateTimeParseException ex) {
                System.out.println("Data Inválida! A data deve ser no formato yyyy-mm-dd!! \n");
            }
        }
    }

}