import java.util.Scanner;

public class Ex21 {
    public static void main(String[]args){
        /*Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO.*/
        Scanner scanner = new Scanner(System.in);
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scanner.close();
    }
}
