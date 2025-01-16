/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package investments2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author jdk5786
 */
public class FlagComponent extends JComponent{
    public void paintComponent(Graphics g) {
        Color myColor = new Color(200,80,135);
        g.setColor(Color.green);
        g.fillRect(100, 100, 60, 30);
        g.setColor(Color.white);
        g.fillRect(100, 130, 60, 30);
        g.setColor(myColor);
        g.fillRect(100, 160, 60, 30);
        g.setColor(Color.black);
        g.drawString("Italian Flag", 100, 80);
    }
}
