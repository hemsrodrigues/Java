
package ldp1;
//Construa um algoritmo que leia três números inteiros e imprima na tela a soma dos dois primeiros subtraído do terceiro.
import javax.swing.JOptionPane;

public class Exercício3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int calc;
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite o primeiro número:");
        a = Integer.parseInt(dado);
        
        dado = JOptionPane.showInputDialog("Digite o segundo número:");
        b = Integer.parseInt(dado);
        
        dado = JOptionPane.showInputDialog("Digite o terceiro número:");
        c= Integer.parseInt(dado);
        
             calc = (a+b-c);
        
        JOptionPane.showMessageDialog(null,calc);
    }
}
