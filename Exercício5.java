//Construa um algoritmo que leia os quatro lados de uma figura e mostre o seu perímetro.
package ldp1;

import javax.swing.JOptionPane;

public class Exercício5 {
    public static void main(String[] args) {
     
        String d1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        float a = Float.parseFloat(d1);
        
        String d2 = JOptionPane.showInputDialog("Digite o segundo número:");
        float b = Float.parseFloat(d2);
        
        String d3 = JOptionPane.showInputDialog("Digite o terceiro número:");
        float c= Float.parseFloat(d3);
        
        String d4 = JOptionPane.showInputDialog("Digite o quarto número:");
        float d= Float.parseFloat(d4);
        
        float calc = (a+b)+(c+d);
        
        JOptionPane.showMessageDialog(null,calc);
    }
    
}
