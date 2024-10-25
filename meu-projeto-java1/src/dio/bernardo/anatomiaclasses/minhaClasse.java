package dio.bernardo.anatomiaclasses;
public class minhaClasse {

public static void main (String [] args ) {

    String primeiroNome = "Bernardo";
    String segundoNome = "Abner";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    
    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}
    
}
