/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package olympics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author jdk5786
 */
public class RingComponent extends JComponent{
    public void paintComponent(Graphics g) {
        Ring blue = new Ring(50, 50, 50, Color.blue);
        blue.drawRing(g);
        Ring black = new Ring(151, 50, 50, Color.black);
        black.drawRing(g);
        Ring red = new Ring(252, 50, 50, Color.red);
        red.drawRing(g);
        Ring yellow = new Ring(101, 101, 50, Color.yellow);
        yellow.drawRing(g);
        Ring green = new Ring(202, 101, 50, Color.green);
        green.drawRing(g);
    }
}
