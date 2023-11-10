import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

         System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário do funcionário: R$" + salario);

        System.out.printf("O funcionário " + nome + " tem um salário de R$" + salario);

        scanner.close();
    }
}
