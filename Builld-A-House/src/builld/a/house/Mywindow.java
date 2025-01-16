/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builld.a.house;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author jdk5786
 */
public class Mywindow extends JComponent{
    private int xpos;
    private int ypos;
    private final static int WIDTH = 50;
    private final static int HEIGHT = 30;
    public Mywindow() {
        xpos = 0;
        ypos = 0;
    }   
    public void paintComponent(Graphics g) {
        g.fillRect(xpos, ypos, 50, 30);
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(565, 205, 310, 362);
        g.setColor(Color.gray);
        g.fillRect(605, 275, 75, 75);
        g.fillRect(752, 275, 75, 75);
        g.fillRect(665, 395, 120, 170);
        int x[]= {477, 947, 712};
        int y[]= {204, 204, 63};
        g.fillPolygon(x, y, 3);
        g.setColor(Color.black);
        g.fillOval(745, 473, 13, 13);
        g.fillRect(1012, 359, 9, 209);
        g.setColor(Color.green);
        g.fillRect(437, 565, 660, 13);
        g.setColor(Color.yellow);
        }
}
