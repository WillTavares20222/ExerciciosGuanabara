import java.util.Scanner;

public class Ex24 {
    public static void main(String[]Args){
        /*Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
viagens até 200Km e R$0.45 para viagens mais longas.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do Passageiro: ");
        String name = scanner.nextLine();

        System.out.print("Informe a distância da viagem em Km: ");
        double distanciaViagem = scanner.nextDouble();

        double precoPorKm;

        if (distanciaViagem <= 200) {
            precoPorKm = 0.50;
        } else {
            precoPorKm = 0.45;
        }

        double precoPassagem = distanciaViagem * precoPorKm;

        System.out.println("O Passageiro "+name+" ira pagar");
        System.out.println("Distância da viagem: " + distanciaViagem + " Km");
        System.out.println("Preço por Km: R$" + precoPorKm);
        System.out.println("Preço da passagem: R$" + precoPassagem);


        scanner.close();
    }
}
