package com.example.exceptions;
import java.util.Scanner;
public class Simulation {

    public static void main(String[] args) {
        getInput();
    }

    public static void getInput() {
        Scanner in = new Scanner(System.in);

        //get input from user
        System.out.println("Type in a number and press Enter...");
        String line = in.nextLine();
        System.out.println("You've typed: " + line);

        //close resources
        in.close();
    }
}