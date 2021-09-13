/**
 * UCF COP3330 Fall 2021 Assignment 8 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        int people,pizza,slices,totalSlices,pieces,leftovers;

        System.out.print("How many people? ");
        people = scnr.nextInt();
        System.out.print("How many pizzas do you have? ");
        pizza = scnr.nextInt();
        System.out.print("How many slices per pizza? ");
        slices = scnr.nextInt();

        totalSlices = pizza * slices;
        pieces = totalSlices / people;
        leftovers = totalSlices % people;

        System.out.println(people + " people with " + pizza + " pizzas (" + totalSlices + " slices)");
        System.out.println("Each person gets " + pieces + " pieces of pizza.");
        System.out.println("There are " + leftovers + " leftover pieces.");
    }
}
