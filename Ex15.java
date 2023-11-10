import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de dias trabalhados no mês: ");
        int diasTrabalhados = scanner.nextInt();


        double valorHora = 25.0;
        int horasPorDia = 8;


        double salario = diasTrabalhados * horasPorDia * valorHora;

        System.out.println("O salário do funcionário é: R$ " + salario);

        scanner.close();
    }
}
