
package ldp1;

import javax.swing.JOptionPane;

public class Exercício9 {
    public static void main(String[] args) {
        
        String d1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        float a = Float.parseFloat(d1);
        String d2 = JOptionPane.showInputDialog("Digite o segundo número:");
        float b = Float.parseFloat(d2);
        String d3 = JOptionPane.showInputDialog("Digite o terceiro número:");
        float c = Float.parseFloat(d3);
        String p1 = JOptionPane.showInputDialog("Digite o primeiro peso:");
        float pn = Float.parseFloat(p1);
        String p2 = JOptionPane.showInputDialog("Digite o segundo peso:");
        float pn2 = Float.parseFloat(p2);
        String p3 = JOptionPane.showInputDialog("Digite o terceiro peso:");
        float pn3 = Float.parseFloat(p3);
        
        float calc = ((a*pn)+(b*pn2)+(c*pn3))/(pn+pn2+pn3);
        
        JOptionPane.showMessageDialog(null,calc);
    }
}
