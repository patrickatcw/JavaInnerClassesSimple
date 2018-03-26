package com.me;

import java.util.ArrayList;

//step 1 create this class
public class Gearbox {

    //step 2 fields
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    //step 15 create variable or field for clutch is in
    private boolean clutchIsIn;

    //step 3 constructor
    public Gearbox(int maxGears) {
        this.maxGears = maxGears;

        //step 4 initialize this manually
        this.gears = new ArrayList<>();

        //step 5 instance Gear
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        //step 20a adding individual gears to the gearbox
        for(int i = 0; i < maxGears; i++){

            addGear(i, i * 5.3);
        }

    }

    //step 13 add method to operate clutch
    public void operateClutch(boolean in){

        //step 14 create variable
        this.clutchIsIn = in;
    }

    //step 16 method to add gears
    public void addGear(int number, double ration){

        if((number > 0) && (number <= maxGears)){
            this.gears.add(new Gear(number, ration));
        }

    }

    //step 17 change gear method
    public void changeGear(int newGear){

        if((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        }else {
            System.out.println("GRIND!");
            this.currentGear = 0;
        }
    }

    //step 18 method for wheel speed
    public double wheelSpeed(int revs){

        if(clutchIsIn){
            System.out.println("SCREAM!!!");
            return 0.0;
        }

        return revs * gears.get(currentGear).getRatio();

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

            //step 19 getter for ratio
            public double getRatio() {
                return ratio;

                //step 20 back to main, nut do step 20a first here for adding gears
            }

            //step 9 create method for drivespeed
            public double driveSpeed(int revs) {

                //step 10 a definition for an inner class
                return revs * (this.ratio);

                //step 11 go back to main

            }

        }

    }


