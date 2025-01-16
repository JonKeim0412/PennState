/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gcdgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
* @author $(user)
* class $(name)
* 
**/



public class GCD_GUI extends JFrame {
    
    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;
    
    public GCD_GUI() {
        // Set up the JFrame
        setTitle("GCD Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create components
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        JButton calculateButton = new JButton("Calculate GCD");
        resultLabel = new JLabel("GCD Result: ");
        
        // Set up layout
        setLayout(new FlowLayout());
        
        // Add components to the JFrame
        add(new JLabel("Enter first number:"));
        add(num1Field);
        add(new JLabel("Enter second number:"));
        add(num2Field);
        add(calculateButton);
        add(resultLabel);
        
        // Add ActionListener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse the input values
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    
                    // Calculate GCD using the GCD class
                    int gcdResult = GCDGUI.gcd(num1, num2);
                    
                    // Display the result in the label
                    resultLabel.setText("GCD Result: " + gcdResult);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid integers.");
                }
            }
        });
    }
    
    public static void main(String[] args) {
        // Launch the GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GCD_GUI().setVisible(true);
            }
        });
    }
}

