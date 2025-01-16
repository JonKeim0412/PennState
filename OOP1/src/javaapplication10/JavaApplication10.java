/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author jdk5786
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cube myCube = new Cube();
        
        myCube.setSide(5);
        
        System.out.println("The volume of a cube of side " + myCube.getSide() + " is " + myCube.calcVolume());
    }
    
}
