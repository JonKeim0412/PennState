/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twodimensionalshape;

/**
 *
 * @author jdk5786
 */
public abstract class TwoDimensionalShape {
    
    protected String name;

    /**
     * @param args the command line arguments
     */
    public TwoDimensionalShape(String name) {
        this.name = name;
    }
    
    public abstract double area();
    public abstract double perimeter();
    
    public String getName() {
        return name;
    }
    
}
