package dio.bernardo.excepcionais;
import java.text.NumberFormat;
import java.text.ParseException;

public class excepcionais2 {
    public static void main(String[] args) {
        Number valor ;
        try{

            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            e.printStackTrace();

        }
    }
    
}
