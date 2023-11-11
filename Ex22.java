import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[]Args){
        /*Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();/* Usei localdate para fazer a logica com a
        data de nascminento do individuo. */

        int idade = anoAtual - anoNascimento;

        System.out.println("Idade: " + idade + " anos");
        if (idade >= 18) {
            System.out.println("Você deve se alistar no serviço militar obrigatório.");
        } else {
            int anosFaltantes = 18 - idade;
            System.out.println("Faltam " + anosFaltantes + " anos para o alistamento.");
        }
        scanner.close();
    }
}
