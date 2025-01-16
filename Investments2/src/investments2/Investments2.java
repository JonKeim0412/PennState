/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package investments2;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author jdk5786
 */
public class Investments2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new InvestmentFrame();
        frame.setTitle("Italian Flag");
        frame.setSize(300,300);
        JComponent component = new FlagComponent();
        frame.add(component);
        frame.setVisible(true);
 
    }
    
}
