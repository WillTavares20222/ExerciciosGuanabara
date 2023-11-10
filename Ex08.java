import java.util.Scanner;

public class Ex08 {
    public static void main(String[]args){

        /* 1 quilômetro (Km) = 1000 metros
        1 hectômetro (Hm) = 100 metros
        1 decâmetro (Dam) = 10 metros
        1 decímetro (dm) = 0.1 metros
        1 centímetro (cm) = 0.01 metros
        1 milímetro (mm) = 0.001 metros */

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Digite o Valor em Metros: ");
        float distancia = (Float) scanner.nextFloat();

        float km, hm, dam, dm, cm, mm;

        km = distancia/1000;
        hm = distancia/100;
        dam = distancia/10;
        dm = distancia*10;
        cm = distancia*100;
        mm = distancia*1000;

        System.out.println(" O Valor em km é de: " + km);
        System.out.println(" O Valor em hm é de: " + hm);
        System.out.println(" O Valor em dam é de: " + dam);
        System.out.println(" O Valor em dm é de: " + dm);
        System.out.println(" O Valor em cm é de: " + cm);
        System.out.println(" O Valor em mm é de: " + mm);

    }
}
