/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timer;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author jdk5786
 */
public class FourLineComponent extends JComponent {  
        private int x;
        private int y;

        public FourLineComponent()
   {  
      x = 50;
      y = 100;
   }

   public void paintComponent(Graphics g){  
      
   
      g.drawLine(0, 0, x, y);
      g.drawLine(0, getHeight(), x, y);
      g.drawLine(getWidth(), 0, x, y);
      g.drawLine(getWidth(), getHeight(), x, y);
   }
   public void setPoint(int newX, int newY){
      x = newX;
      y = newY;
      
      }

}




