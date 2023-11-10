import java.util.Scanner;

public class Desafio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de cigarros fumados por dia: ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Quantidade de anos fumados: ");
        int anosFumados = scanner.nextInt();

        int totalCigarros = anosFumados * 365 * cigarrosPorDia;
        int minutosPerdidos = totalCigarros * 10;
        int diasPerdidos = minutosPerdidos / 1440;

        System.out.println("Um fumante perderá aproximadamente " + diasPerdidos + " dias de vida.");

        scanner.close();
    }
}
