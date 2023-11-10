import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de Km percorridos: ");
        double kmPercorridos = scanner.nextDouble();


        System.out.print("Digite a quantidade de dias de aluguel: ");
        int diasAluguel = scanner.nextInt();


        double precoPorDia = 90.0;
        double precoPorKm = 0.20;


        double precoTotal = (diasAluguel * precoPorDia) + (kmPercorridos * precoPorKm);

        System.out.println("O preço total a pagar é: R$ " + precoTotal);

        scanner.close();
    }
}
