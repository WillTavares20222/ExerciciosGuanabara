import java.util.Scanner;

public class Ex02 {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        System.out.println("Qual o seu nome ? ");
        String name = in.nextLine();
        System.out.println(" um Prazer em te conhercer, " + name + " Seja Bem Vindo!! ");
        in.close();
    }
}
