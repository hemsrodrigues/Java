//Construa um algoritmo que leia quatro números inteiros e imprima na tela a soma dos dois primeiros, multiplicado pela soma dos dois últimos.
package ldp1;

import javax.swing.JOptionPane;

public class Exercício4 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int calc;
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite o primeiro número:");
        a = Integer.parseInt(dado);
        
        dado = JOptionPane.showInputDialog("Digite o segundo número:");
        b = Integer.parseInt(dado);
        
        dado = JOptionPane.showInputDialog("Digite o terceiro número:");
        c= Integer.parseInt(dado);
        
        dado = JOptionPane.showInputDialog("Digite o quarto número:");
        d= Integer.parseInt(dado);
        
             calc = (a+b)*(c+d);
        
        JOptionPane.showMessageDialog(null,calc);
    }
}
