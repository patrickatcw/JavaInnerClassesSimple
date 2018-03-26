package com.me;
//https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
//improves encapsulation

public class Main {

    public static void main(String[] args) {

        //step 11 instances
        Gearbox mcLaren = new Gearbox(6);
        /*Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));*/
        //step 12 run
        //results; 12300.0

        //step 20 calling created methods from gearbox class
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        //step 21 run, comment out lines 11 and 12
        /*
        result;
        Gear 1 selected.
        5300.0
        GRIND!
        0.0
         */

        //step 22 some changes
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
        //step 23 run
        /*
        results;
        Gear 1 selected.
        5300.0
        GRIND!
        0.0
        Gear 3 selected.
        95400.0
         */


        //step 13 add method to operate clutch in gearbox class

    }

}
