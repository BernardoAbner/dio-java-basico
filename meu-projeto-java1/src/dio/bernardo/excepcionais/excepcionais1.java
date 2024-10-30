package dio.bernardo.excepcionais;

import java.util.Scanner;
import java.util.InputMismatchException;

public class excepcionais1 {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Insira a sua altura: ");
        double altura = scanner.nextDouble();
        


        System.out.println("Ola, me chamo "+ nome.toUpperCase() + " " + sobrenome.toUpperCase() + " ");
        System.out.println("Tenho "+ idade +" anos ");
        System.out.println("Minha altura é "+ altura + (" cm"));
        scanner.close();
        }
        catch (InputMismatchException e){
            System.out.println("O campo idade e altura precisam ser numéricos!!");
        }   
        
    }
    
}

