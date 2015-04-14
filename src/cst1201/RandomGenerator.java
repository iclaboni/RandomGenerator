package cst1201;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RandomGenerator {

    public static void main(String[] args) {
        //TODO: Create a Scanner object to read keyboard input.
        Scanner scan = new Scanner(System.in);

        //TODO: Ask the user a lower and upper bound.
        System.out.print("Enter a lower bound:");
        int lowerBound = scan.nextInt();

        System.out.print("Enter an upper bound:");
        int upperBound = scan.nextInt();

        //TODO: Ask the user for the number of random integers to generate.
        System.out.print
        ("The number of random integer that should be generated:");
        int numInt = scan.nextInt();

        //TODO: Generate random integers of the desired length and bound.
        Random random = new Random();
        //IntStream intStream = random.ints();

        IntStream intStream = random.ints(numInt, lowerBound, upperBound);

        System.out.println(intStream);
        //TODO: Print the average, max, min, count, and sum of the integers.
    }
}
