import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex06_01{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println(" O Antecessor de, " + numero + " é : " + antecessor);
        System.out.println(" O Sucessor de," + numero + " é : " + sucessor);
    }
}
