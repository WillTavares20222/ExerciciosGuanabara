import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args){
        /* Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade; ");
        int idade = scanner.nextInt();
        if (idade >= 16){
            System.out.println("Você ja pode votar!! ");
        }
        else {
            System.out.println("Voce ainda não tem idade para votar! ");
        }

        scanner.close();
    }
}
