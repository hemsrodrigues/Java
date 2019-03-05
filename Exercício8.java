
package ldp1;

import javax.swing.JOptionPane;

public class Exercício8 { 
    public static void main(String[] args) {
        
        String d1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        float a = Float.parseFloat(d1);
        String d2 = JOptionPane.showInputDialog("Digite o segundo número:");
        float b = Float.parseFloat(d2);
        String d3 = JOptionPane.showInputDialog("Digite o terceiro número:");
        float c = Float.parseFloat(d3);
        float calc = (a+b+c)/(3);
        
        JOptionPane.showMessageDialog(null,calc);
    }
}
