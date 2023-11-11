import java.util.Scanner;

public class Desafio25 {
    public static void main(String[]Args){
        /*[DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
de cada lado deve ser menor que a soma dos outros dois.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o comprimento dos três segmentos de reta:");

        System.out.print("Segmento 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Segmento 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Segmento 3: ");
        double lado3 = scanner.nextDouble();

        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
            System.out.println("É possível formar um triângulo com esses segmentos de reta.");
        } else {
            System.out.println("Não é possível formar um triângulo com esses segmentos de reta.");
        }

    }
}
