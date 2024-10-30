package dio.bernardo.condicionais;

public class condicionais4 {
    public static void main(String[] args) {
        
    
    int nota = 5;
    String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota < 7 ? "Prova de recuperação" : "Reprovado";

    System.out.print(resultado);

    
}
}
