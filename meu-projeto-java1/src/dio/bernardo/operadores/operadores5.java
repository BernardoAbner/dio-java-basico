package dio.bernardo.operadores;

public class operadores5 {
    public static void main (String [] args){
       
        boolean simNao;

        int numero1, numero2;
        numero1 = 1;
        numero2 = 2;

        String nomeUm = "Bernardo";
        String nomeDois = "Bernardo";

        System.out.print(nomeUm == nomeDois);
        System.out.print(nomeUm.equals(nomeDois) );

        simNao =  numero1 == numero2;
        System.out.print("Número 1 é igual a número 2? "+ simNao);

        simNao = numero1 != numero2;
        System.out.print("Número 1 é diferente de número 2? "+ simNao);

        simNao = numero1 > numero2;
        System.out.print("número 1 é  amior que o número 2? "+ simNao);
    }

    
}
