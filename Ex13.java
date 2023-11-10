import java.util.Scanner;

public class Ex13 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salario em: R$ ");
        double valorSalario = scanner.nextDouble();
        System.out.print("Digite o Valor do aumento em %: ");
        double aumento = scanner.nextDouble();

        double novoAumento = valorSalario * (aumento / 100);
        double novoSalario = valorSalario + novoAumento;

        System.out.println(" O Valor do seu aumento é de: R$ " + novoAumento);
        System.out.println(" O Valor do seu novo Salario é de: R$ " + novoSalario);

        scanner.close();

    }
}
