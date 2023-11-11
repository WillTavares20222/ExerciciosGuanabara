import java.util.Scanner;

public class Ex20 {

    public static void main(String[]args){
/*Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.*/
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.print("O número " + numero + " é PAR.");
        } else {
            System.out.print("O número " + numero + " é ÍMPAR.");
        }

        scanner.close();
    }
}
