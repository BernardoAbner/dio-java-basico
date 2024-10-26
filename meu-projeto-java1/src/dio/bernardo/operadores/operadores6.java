package dio.bernardo.operadores;

public class operadores6 {
    public static void main(String[] args) {
        boolean condicao1, condicao2;

        condicao1 = true;
        condicao2 = false;

        if (condicao1 && condicao2){
            System.out.print("As duas condições são verdadeiras.");

        }
        else{
            System.out.print("Uma das duas condições não é verdadeira.");
        }
        if (condicao1 || condicao2){
            System.out.print("Ao menos uma das condições são verdadeiras.");
        }
        else{
            System.out.print("Nenhuma das duas condições são verdadeiras");
        }
        
    }
    
}
