package org.example;

import java.util.Scanner;

/**
 * Please enter the number of the month: 3
 * The name of the month is March.
 *
 */

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in=new Scanner(System.in);
        int monthN;
        String m;
        System.out.print( "Please enter the number of the month: " );
        monthN=in.nextInt();
        switch(monthN){
            case 1: monthN=1;
                m="january";
                break;
            case 2: monthN=2;
                m="February";
                break;
            case 3: monthN=3;
                m="March";
                break;
            case 4: monthN=4;
                m="April";
                break;
            case 5: monthN=5;
                m="May";
                break;
            case 6: monthN=6;
                m="june";
                break;
            case 7: monthN=7;
                m="July";
                break;
            case 8: monthN=8;
                m="August";
                break;
            case 9: monthN=9;
                m="September";
                break;
            case 10: monthN=10;
                m="October";
                break;
            case 11: monthN=11;
                m="November";
                break;
            case 12: monthN=12;
                m="December";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + monthN);
        }

        System.out.println( "The name of the month is "+m+"." );
    }
}
