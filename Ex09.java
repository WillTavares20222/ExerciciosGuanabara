import java.util.Scanner;

public class Ex09 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Quantos Dolar voce quer comprar:  ");
        float real = (Float) scanner.nextFloat();

        float dolar, conversao;

        dolar = real*5.08f;
        conversao = dolar;

        System.out.println(" Voce vai precisar de: US$ " + conversao + " Para comprar. ");
    }
}
