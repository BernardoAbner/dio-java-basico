package dio.bernardo.tiposVariaveis;

public class aula03 {
    public static void main(String[] args) throws Exception {
    double salarioMinimo = 2500.33;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal;

    System.out.print(salarioMinimo);
    System.out.print(numeroCurto2);


    int numero = 5;
    numero = 10;
    
    System.out.println (numero);
    
    final double  VALOR_DE_PI = 3.14;

    System.out.print (VALOR_DE_PI);


}
}