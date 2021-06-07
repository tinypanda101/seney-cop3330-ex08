/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */

import java.util.Scanner;

public class PizzaParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people?");
        int amountOfPeople = scanner.nextInt();

        System.out.println("How many pizzas do you have?");
        int amountOfPizzas = scanner.nextInt();

        System.out.println("How many slices per pizza?");
        int slicesPerPizzas = scanner.nextInt();

        int amountOfSlices = slicesPerPizzas * amountOfPizzas;

        System.out.println(amountOfPeople + " people with " + amountOfPizzas + " pizzas (" + amountOfSlices + " slices).");

        int slicesPerPerson = (amountOfSlices / amountOfPeople);

        int remainder = (amountOfSlices % amountOfPeople);

        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + remainder + " leftover pieces.");
    }
}
