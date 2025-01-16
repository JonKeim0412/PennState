/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package olympics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author jdk5786
 */
public class Ring {
    private int x, y, radius;
    private Color color;
    
    public Ring(int x, int y, int r, Color c) {
        this.x = x;
        this.y = y;
        radius = r;
        color = c;
    }
    public void drawRing(Graphics g) {
       Graphics2D g2d = (Graphics2D) g;
       g2d.setStroke(new BasicStroke(5));
       
       g2d.setColor(color);
       g2d.drawOval(x, y, 2*radius, 2*radius);
    }
}
