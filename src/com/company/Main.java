package com.company;

import javax.print.attribute.standard.PDLOverrideSupported;

public class Main {
// tak się robi komentarz

    /* tak kilko
    linijkowy
     */

    public static void main(String[] args) {
        String name = "John ";
        String LastName = "Wick";
        int myNumber = 8;
        char myLetter = 'D';
        boolean myTrouth = true;
        double myDoubleNumber = 1.99;
        float myFloutNumber = 2.99f;


            System.out.println("Hello!");
            System.out.println(name);
            System.out.println(myNumber);
            System.out.println(myLetter);
            System.out.println(myDoubleNumber);
            System.out.println(myTrouth);
            System.out.println("Character name is " + name + LastName);

// rozszerzanie
        int myInt1 = 9;
        double myDouble1 = myInt1;
            System.out.println(myDouble1);

// dodanie
        int x = 8;
        int y= 6;
            System.out.println(" dodanie x i y to " + x + y);

// zwężanie
        double mydouble2 = 9.99;
        int myint2 = (int) mydouble2;
            System.out.println(myint2);

// dlugosc tekstu
         String txt = "serial wiedzmin to gniot";
            System.out.println("The length of the text is " +txt.length() );

// matma
        System.out.println(Math.random());

// if else else if statement
        int time = 22;
        if (time <10) {
            System.out.println("good morning");
        } else if (time <20) {
            System.out.println("good day");
        } else {
            System.out.println("Good evening");
        }

// switche
        int day = 7;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Fridayt");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward for the weekend");

              }

//loops
        int z = 1;
        while( z < 4 ) {
            System.out.print("value of z : " + z );
            z++;
            System.out.print("\n");
        }
        }
    }

