//Construa um algoritmo que leia dois números inteiros e imprima na tela a soma destes números.
package ldp1;

import javax.swing.JOptionPane;


public class Exercício1 {
    public static void main(String[] args) {
        int a;
        int b;
        int soma;
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite o primeiro número:");
        a = Integer.parseInt(dado);
        
        dado = JOptionPane.showInputDialog("Digite o segundo número:");
        b = Integer.parseInt(dado);
        
        soma = a+b;
        
        JOptionPane.showMessageDialog(null,"A soma é: "+soma);
        
        //Construa um algoritmo que leia dois números inteiros e imprima na tela o resultado da multiplicação destes números.
        
    }
}
