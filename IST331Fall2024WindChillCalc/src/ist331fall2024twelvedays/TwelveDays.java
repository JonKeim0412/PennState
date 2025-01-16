/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ist331fall2024twelvedays;


/**
* @author $jdk5786
* class $TwelveDays
* 
**/

public class TwelveDays {

    public static void main(String[] args) {
        
        for (int day = 1; day <= 12; day++) {
            intro(getDayOrdinal(day));
            switch (day) {
                case 1: day1(); break;
                case 2: day2(); break;
                case 3: day3(); break;
                case 4: day4(); break;
                case 5: day5(); break;
                case 6: day6(); break;
                case 7: day7(); break;
                case 8: day8(); break;
                case 9: day9(); break;
                case 10: day10(); break;
                case 11: day11(); break;
                case 12: day12(); break;
            }
            System.out.println(); 
        }
    }

    
    public static void intro(String day) {
        System.out.println("On the " + day + " day of Christmas my true love gave to me:");
    }

   
    private static String getDayOrdinal(int day) {
        switch (day) {
            case 1: return "first";
            case 2: return "second";
            case 3: return "third";
            case 4: return "fourth";
            case 5: return "fifth";
            case 6: return "sixth";
            case 7: return "seventh";
            case 8: return "eighth";
            case 9: return "ninth";
            case 10: return "tenth";
            case 11: return "eleventh";
            case 12: return "twelfth";
            default: return "";
        }
    }

  
    public static void day1() {
        System.out.println("A Partridge in a Pear Tree.");
    }

    public static void day2() {
        System.out.println("Two Turtle Doves,");
        day1();
    }

    public static void day3() {
        System.out.println("Three French Hens,");
        day2();
    }

    public static void day4() {
        System.out.println("Four Calling Birds,");
        day3();
    }

    public static void day5() {
        System.out.println("Five Gold Rings,");
        day4();
    }

    public static void day6() {
        System.out.println("Six Geese a Laying,");
        day5();
    }

    public static void day7() {
        System.out.println("Seven Swans a Swimming,");
        day6();
    }

    public static void day8() {
        System.out.println("Eight Maids a Milking,");
        day7();
    }

    public static void day9() {
        System.out.println("Nine Ladies Dancing,");
        day8();
    }

    public static void day10() {
        System.out.println("Ten Lords a Leaping,");
        day9();
    }

    public static void day11() {
        System.out.println("Eleven Pipers Piping,");
        day10();
    }

    public static void day12() {
        System.out.println("Twelve Drummers Drumming,");
        day11();
    }
}

