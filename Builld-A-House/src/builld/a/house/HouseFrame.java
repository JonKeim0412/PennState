/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builld.a.house;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author jdk5786
 */
public class HouseFrame extends JFrame{
    private HoseComponent hc;
    private ActionListener listener;
   
    public HouseFrame() {
        hc = new HoseComponent();
        add(hc);
        setSize(250, 250);
}
}

