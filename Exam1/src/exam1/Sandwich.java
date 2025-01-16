/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam1;

/**
 *
 * @author jdk5786
 */
public class Sandwich {

    private String type;
    private String meat;
    private String cheese;
    private int extras;
    private double price;

public void Sandwich() { 
    type = "";
    meat = "";
    cheese = "";
    extras = 0;
    price = 0;
}
       
public void setType(String newType) {
    type = newType;
}

public String getType() {
    return type;
}
public void setMeat(String newMeat) {
    meat = newMeat;
}
public String getMeat() {
    return meat;
}
public void setCheese(String newCheese) {
    cheese = newCheese;
}

public String getCheese() {
    return cheese;
}
public void setExtras(int e){
    extras = e;
}
public int getExtras(){
    return extras;
}
public double calcPrice() {
    if (type.equals("hoagie") ) {
        price = 5 + 0.5 * extras;
    }
    else if (type.equals("panini")) {
        price = 6 + 0.5 * extras;
    }
        return price;
}


    
}
