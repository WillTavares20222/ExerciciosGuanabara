import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        /*19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0).*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro aluno; ");
        String aluno = scanner.nextLine();

        System.out.println("Digite a Primeira nota do " + aluno + ":");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a Segunda nota do " + aluno + ":");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média do aluno " + aluno + ": " + media);

        if (media >= 7) {
            System.out.println("Aluno " + aluno + " com bom aproveitamento. " );
        } else {
            System.out.println("Aluno " +aluno+"com aproveitamento abaixo da média. " );
        }

        scanner.close();
    }
}