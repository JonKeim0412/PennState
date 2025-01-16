/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ist311fall2024stringsandarrays;


/**
 * Program Name:                DeleteMe
 * 
 * Functionality:               IST311 Fall 2024 Demo of making conventions, 
 *                              programming style, JavaDoc, etc.
 * 
 * Date:                        4 September 2024 11:43
 * 
 * @author                      Jonathan D. Keim 
 *                              Penn State Berks 
 *                              Reading, PA 19610
 *                              484-941-1332
 *                              jdk5786@psu.edu
 * 
 */
/************************** MODIFICATION LOG **************************
 * 
 * 9 September 2024  Cleaned up code, standardized GUI - jdk5786
 * 
 * 4 September 2024  Initial Program design and basic implementation - jdk5786
 * 
 *********************************************************************/

public class IST311StringDemo 
{
    StringBuffer sbOut;
    int intObjID;
    
    public IST311StringDemo(){
        initializeVars();
    }
    
    public IST311StringDemo(int intIn){
        initializeVars(intIn);
    }
    public void initializeVars(){
        initializeVars(createRandomInt(1, 10));
    }
    public void initializeVars(int intIn){
        intObjID = intIn;
        sbOut = new StringBuffer(toString());
    }//Sets the Objects variables to their initial values
    
    public int createRandomInt(int intBottom, int intTop){
        return 5;
    }
    
    public void printString(String strIn) {
        int intStrLen = strIn.length();
        for(int intLCV = 0; intLCV < intStrLen; intLCV++) {
            System.out.println(strIn.charAt(intLCV));
        }//for
    }//printString
    
    
    
    public String toString(){
        String strOutput;
        strOutput = ("The Parent class of StringDemo is " + super.toString());
        return strOutput;
    }//toString
            
    public static void main(String[] args) {
        String strTemp = "This is a test string";
        strTemp = strTemp.toLowerCase();
        StringDemo mySD = new StringDemo();
      //  mySD.printString(strTemp);
        System.out.println(mySD);
    }//main
    
}//StringDemo
