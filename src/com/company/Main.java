package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    //    private static void stringLesson() {
//        String name="John ";
//        String LastName="Wick";
//        int myNumber=8;
//        char myLetter='D';
//        boolean myTrouth=true;
//        double myDoubleNumber=1.99;
//        float myFloutNumber=2.99f;
//
//        System.out.println("Hello!");
//        System.out.println(name);
//        System.out.println(myNumber);
//        System.out.println(myLetter);
//        System.out.println(myDoubleNumber);
//        System.out.println(myTrouth);
//        System.out.println("Character name is " + name + LastName);
//    }

    public static void main(String[] args) {


//        int[] tablica={10, 20, 30, 40, 50, 60, 70};
//        int index=0;
//        while (index < tablica.length) {
//            if (index % 2 != 0) {
//                //    System.out.println(tablica[index]);
//            }
//            //          System.out.println(tablica[index]);
//            //          index = index + 2;
//            index++;
//        }
//        for (int index1=0; index1 < tablica.length; index1++) {
//            System.out.println(tablica[index1]);
//        }
//
//// rozszerzanie
//        int myInt1=9;
//        double myDouble1=myInt1;
//        System.out.println(myDouble1);
//
//// dodanie
//        int x=8;
//        int y=6;
//        System.out.println(" dodanie x i y to " + x + y);
//
//// zwężanie
//        double mydouble2=9.99;
//        int myint2=(int) mydouble2;
//        System.out.println(myint2);
//
//// dlugosc tekstu
//        String txt="serial wiedzmin to gniot";
//        System.out.println("The length of the text is " + txt.length());
//
//// matma
//        System.out.println(Math.random());
//
//// if else else if statement
//        int time=22;
//        if (time < 10) {
//            System.out.println("good morning");
//        } else if (time < 20) {
//            System.out.println("good day");
//        } else {
//            System.out.println("Good evening");
//        }
//// switche
//        int day=3;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Fridayt");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Looking forward for the weekend");
//        }
////loops
//
//        int z=1;
//        while (z < 4) {
//            System.out.print("value of z : " + z);
//            z++;
//            System.out.print("\n");
//        }
//        int i=0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
//
//           int rowsCount = 2;
//           int columnsCount = rowsCount + 2;
//                    for (int k = 0; k <= rowsCount; k++) {
//
//                   for (int j=0; j <= columnsCount; j++) {
//                          System.out.print("* ");
//                          }
//                           System.out.println("");
//           }

        trojkat(8);
    }

    static void trojkat(int wysokosc) {

        int rowsCount1=wysokosc;
        int columnsCount1=rowsCount1 * 2;
        for (int p=0; p < rowsCount1; p++) {
            for (int l=0; l < columnsCount1 - 2 * p; l++) {
                System.out.print(" ");
            }
            for (int k=0; k < 2 * p + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void zanied2() {
        int [] tablica1={1, 2, 4, 6, 8, 11, 12};
        int punkt1=5;
        int punkt2=6;

        for (int i=0; i < tablica1.length; i++) {
            if (tablica1[i] == punkt1 ) {
                System.out.println("wartość" + punkt1 + " występuje w tablicy ");
            } else {
                System.out.println("wartość" + punkt1 + " nie wystepuje w tablicy");
            }
        }
    }
}