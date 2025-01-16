/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author jdk5786
 */
public class Timer2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FourLineComponent component = new FourLineComponent();
        class MousePressListener implements MouseListener{
      
         public void mousePressed(MouseEvent event) {
            component.setPoint(event.getX(), event.getY());
            component.repaint();
            
         }

         public void mouseReleased(MouseEvent event) {}
         public void mouseClicked(MouseEvent event) {}
         public void mouseEntered(MouseEvent event) {}
         public void mouseExited(MouseEvent event) {}
      }
         
      MouseListener listener = new MousePressListener();
      component.addMouseListener(listener);

      JFrame frame = new JFrame();
      frame.add(component);

      frame.setSize(400,400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}


        /*class CurrentTimePrinter implements ActionListener{
            public void actionPerformed(ActionEvent event){
            System.out.println(new Date());
        }
    }
        CurrentTimePrinter listener = new CurrentTimePrinter();
        Timer t = new Timer(1000, listener); 
        t.start();
        System.out.println(new Date());
        JOptionPane.showMessageDialog(null, "Quit?"); 
        System.exit(0);

        class TimerToggler implements ActionListener {
         public void actionPerformed(ActionEvent event) {
            if (t.isRunning()) { t.stop(); }
            else { t.restart(); }
            } 
        }  

        ActionListener listener2 = new TimerToggler(); 
        Timer t2 = new Timer(5000, listener2); 
        t2.start();
        
        class ProgramStopper implements ActionListener {
        public void actionPerformed(ActionEvent event) {
        System.exit(0);
    }


        ActionListener listener3 = new ProgramStopper();
        Timer t3 = new Timer(120000, listener3);
        t3.start();

        JOptionPane.showMessageDialog(null, "Please wait"); 


        JFrame frame = new JFrame();
      
      // Create and add a mouse listener

        class EnterExitListener implements MouseListener {
            public void mouseEntered(MouseEvent event)
            {
                System.out.println("Mouse Entered");
                frame.getContentPane().setBackground(Color.BLUE);
            }
         
                public void mouseExited(MouseEvent event)
            {
                 System.out.println("Mouse Exited");
                 frame.getContentPane().setBackground(Color.RED);
            }

         // Do-nothing methods
            public void mousePressed(MouseEvent event) {}
            public void mouseReleased(MouseEvent event) {}
            public void mouseClicked(MouseEvent event) {}
      }
         
            MouseListener listener = new EnterExitListener();
            frame.addMouseListener(listener);
            frame.setSize(300, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);*/
        
   



        
    


        
    

