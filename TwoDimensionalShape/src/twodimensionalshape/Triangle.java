/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package twodimensionalshape;


/**
* @author $(user)
* class $(name)
* 
**/

public class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    // Constructor for Triangle
    public Triangle(double base, double height, double side1, double side2, double side3) {
        super("Triangle");
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implement the area method
    @Override
    public double area() {
        return 0.5 * base * height;
    }

    // Implement the perimeter method
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
