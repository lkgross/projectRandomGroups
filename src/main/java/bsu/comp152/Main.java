package bsu.comp152;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Set up to read from file.
        File myFile = new File("namesSection001");
        Scanner inputFile = new Scanner(myFile);

        // Create a roster of names.
        ArrayList<String> names = new ArrayList<String>();
        // Initialize the class size to zero.
        int classSize = 0;

        // Add the people from the file into the class.
        while (inputFile.hasNext()) {
            names.add(inputFile.nextLine());
            classSize++;
        }

        // Print the roster and class size.
        System.out.println(names);
        System.out.println(classSize);

        // Set up to use a random index.
        Random rand = new Random();
        int randIndex;

        // Print and remove people from the list one-by-one at random.
        // Print their names, and group them by threes.
        for (int i = 0; i < classSize; i++) {
            // If the loop variable is divisible by three, print a demarcation.
            if (i % 3 == 0) {
                System.out.println("---");
            }
            // Generate a random index from among the remaining names.
            randIndex = rand.nextInt(names.size());
            // Print the random name and remove it from the roster.
            System.out.println(names.get(randIndex));
            names.remove(randIndex);
        }
    }
}