package com.me;
//https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
//improves encapsulation

public class Main {

    public static void main(String[] args) {

        //step 11 instances
        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));
        //step 12 run
        //results; 12300.0


    }

}
