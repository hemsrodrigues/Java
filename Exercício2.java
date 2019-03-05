//Construa um algoritmo que leia dois números inteiros e imprima na tela o resultado da multiplicação destes números.
package ldp1;

import javax.swing.JOptionPane;

public class Exercício2 {
    public static void main(String[] args) {
        int a;
        int b;
        int multiplicacao;
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite o primeiro número:");
        a = Integer.parseInt(dado);
        
        dado = JOptionPane.showInputDialog("Digite o segundo número:");
        b = Integer.parseInt(dado);
        
        multiplicacao = (a*b);
        
        JOptionPane.showMessageDialog(null,"A multiplicação é: "+multiplicacao);
    }
}
