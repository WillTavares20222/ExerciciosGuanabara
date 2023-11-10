import javax.swing.*;

public class Ex06 {
    public static void main(String[]args){

        String a="";
        int num=0;
        int antecessor=0;
        int sucessor=0;
        String Saida="";

        a = JOptionPane.showInputDialog("Entre com o Numero Ex.: 0 - 1 - 2");

        num = Integer.parseInt(a);
        antecessor = num -1;
        sucessor = num +1;

        Saida += " O Antecessor de, " + num + " é de: " + antecessor;
        Saida += " O Sucessor de," + num + " é de : " + sucessor;
        JOptionPane.showConfirmDialog(null,Saida);
    }
}
