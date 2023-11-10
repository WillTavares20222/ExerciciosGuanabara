import java.util.Scanner;

public class Ex10 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Digite a Largura da parede em Metros:  ");
        float largura = (Float) scanner.nextFloat();

        Scanner leitura = new Scanner(System.in);
        System.out.print(" Digite a Altura da parede em Metros:  ");
        float altura = (Float) leitura.nextFloat();

        float area = largura*altura;
        float quantidade = area/2;

        System.out.println(" A sua area total para pintura é de: " + area + " Metros Quadrados " + " A quantidade de tinta será nescessario: " + quantidade + " Litros");
    }
}
