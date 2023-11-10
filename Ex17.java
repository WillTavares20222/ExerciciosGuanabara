import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua velocidade atual ?");
        double velocidade = scanner.nextDouble();
        if (velocidade > 80){
           /* System.out.println("**** Você Foi multado!! ***** ");*/
            double quilometrosAcima = velocidade - 80;
            double multa = quilometrosAcima * 5.0;

            System.out.println("Você foi multado!");
            System.out.println("Velocidade acima do limite: " + quilometrosAcima + " Km/h");
            System.out.println("Valor da multa: R$" + multa);
        } else {
            System.out.println("Velocidade dentro do limite permitido. Você não foi multado.");
        }


        scanner.close();
    }

}
