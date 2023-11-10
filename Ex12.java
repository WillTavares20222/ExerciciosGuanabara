import java.util.Scanner;

public class Ex12 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$ ");
        double precoOriginal = scanner.nextDouble();


        double desconto = 0.05;
        double precoPromocional = precoOriginal * (1 - desconto);

        System.out.println("O preço promocional com 5% de desconto é: R$ " + precoPromocional);

        scanner.close();
    }
}
