import java.util.Scanner;

public class Ex07 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Digite o Valor: ");
        float salario = (Float) scanner.nextFloat();
        float terca, dobro;
        float valor = salario;

        terca = valor/3;
        dobro = valor*2;

        System.out.println(" O Dobro de valor é: " + dobro);
        System.out.println(" A Sua terça parte é de: " + terca);

    }
}
