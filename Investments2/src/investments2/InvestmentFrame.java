package investments2;


;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdk5786
 */
public class InvestmentFrame extends JFrame{
   
    private JLabel rateLabel;
    private JTextField rateField;
    private JButton button;
    private JLabel resultLabel;
    private JPanel panel;
    private double balance;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    public InvestmentFrame() {
        balance = INITIAL_BALANCE;
        createComponents();
        setSize(300,100);
        setLocation(200,200);
     }
    
    private static final double INTEREST_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;
      private void createComponents() {
        rateLabel = new JLabel("Int rate: ");
        rateField = new JTextField(""+INTEREST_RATE, 5);
        button = new JButton("Add Interest");
        resultLabel = new JLabel(String.format("Balance: $%.2f", balance));
        
        textArea = new JTextArea(10,30);
        textArea.setText(String.format("Account Balance; $%.2f", balance));
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
        
        panel = new JPanel();
        panel.add(rateLabel);
        panel.add(rateField);
        panel.add(button);
        panel.add(resultLabel);
        panel.add(scrollPane);
        add(panel);
    }
      class AddInterestListener implements ActionListener {
          public void actionPerformed(ActionEvent e) {
              double rate = Double.parseDouble(rateField.getText());
              double interest = balance * rate/100;
              balance += interest;
              textArea.append(String.format("Balance: $%.2f%n", balance));
          }
          
      }
}

