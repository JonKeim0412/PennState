/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author jdk5786
 */
public class Cube {
    private double side;
    private double volume;
    
    public void setSide(double newSide) {
        side = newSide;
        
    }
    public double calcVolume() {
        volume = Math.pow(side,3);
        return volume;
    }    
    public double getSide() {
        return side;
} 

}

