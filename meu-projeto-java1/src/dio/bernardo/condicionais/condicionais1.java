package dio.bernardo.condicionais;

public class condicionais1 {
    public static void main(String[] args) throws Exception {
        double saldo = 25.5;
        double valorSolicitado = 17;


        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }

        System.out.print(saldo);
        
    }
}
