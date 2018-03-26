package com.me;

import java.util.ArrayList;

//step 1 create this class
public class Gearbox {

    //step 2 fields
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;

    //step 3 constructor
    public Gearbox(int maxGears) {
        this.maxGears = maxGears;

        //step 4 initialize this manually
        this.gears = new ArrayList<>();

        //step 5 instance Gear
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

    }

        //step 6 inner class
        class Gear {

            //step 7 add fields
            private int gearNumber;
            private double ratio;

            //step 8 add constructor
            public Gear(int gearNumber, double ratio) {
                this.gearNumber = gearNumber;
                this.ratio = ratio;
            }

            //step 9 create method for drivespeed
            public double driveSpeed(int revs) {

                //step 10 a definition for an inner class
                return revs * (this.ratio);

                //step 11 go back to main

            }

        }

    }


