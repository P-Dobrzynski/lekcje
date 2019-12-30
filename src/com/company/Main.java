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
    }
}
