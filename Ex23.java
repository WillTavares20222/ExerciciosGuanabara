import java.util.Scanner;

public class Ex23 {
    public static void main(String[]Args){
        Scanner scanner = new Scanner(System.in);
       /*Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que:
- Homens ganham 5% de desconto
- Mulheres ganham 13% de desconto*/
        System.out.println("Qual o nome do cliente? ");
        String name = scanner.nextLine();

        System.out.print("Informe o sexo do cliente (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite o valor da compra: ");
        Double valorCompras = scanner.nextDouble();

        double desconto = 0;

        if (sexo == 'M' || sexo == 'm') {
            // Desconto de 5% para homens
            desconto = 0.05;
        } else if (sexo == 'F' || sexo == 'f') {
            // Desconto de 13% para mulheres
            desconto = 0.13;
        } else {
            System.out.println("Sexo inválido. Por favor, informe M para masculino ou F para feminino.");
            scanner.close();
            return;
        }
        double valorComDesconto = valorCompras - (valorCompras * desconto);

        System.out.println("Cliente: " + name);
        System.out.println("Valor das compras: R$" + valorCompras);
        System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
        System.out.println("Valor com desconto: R$" + valorComDesconto);

        scanner.close();
    }
}
