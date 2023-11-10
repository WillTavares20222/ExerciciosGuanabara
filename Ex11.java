import java.util.Scanner;

    public class Ex11 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o valor de A: ");
                double a = scanner.nextDouble();

                System.out.print("Digite o valor de B: ");
                double b = scanner.nextDouble();

                System.out.print("Digite o valor de C: ");
                double c = scanner.nextDouble();

                double delta = calcularDelta(a, b, c);

                System.out.println("O valor de Delta (Δ) é: " + delta);
                scanner.close();

            }

            public static double calcularDelta(double a, double b, double c) {
                return Math.pow(b, 2) - 4 * a * c;

            }
        }