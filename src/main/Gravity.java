package main;
/**
 * @author Manoj Kumar Chaudhary
 * @version 1.0
 */


import java.util.Scanner;

public class Gravity {
    public static void main(String[] args) {
        double time = 0.0;
        double velocity = 0.0;
        double distance = 0.0;
        double gravity = 9.8;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the falling time (in second): ");
        time = keyboard.nextDouble();
        velocity = gravity * time;
        distance = ((1.0 * gravity * time * time) / 2);
        System.out.println("The speed of object at " + time + " seconds after its release is " + velocity + " and the distance the object has travelled in the " + time + "  seconds after the realease is " + distance);


    }

}
