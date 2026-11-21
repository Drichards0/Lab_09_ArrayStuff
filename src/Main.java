
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // STEP 1: Declare an integer array with 100 elements
        int[] dataPoints = new int[100];

        // STEP 2: Fill the array with random numbers from 1 to 100
        Random rnd = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // STEP 3: Display all array values
        System.out.println("The values in the dataPoints array are:");

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }

        System.out.println("\n");

        // STEP 4: Calculate the sum and average
        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the dataPoints array is: " + sum);
        System.out.println("The average of the dataPoints array is: " + average);

        System.out.println();

        // STEP 5: Ask the user for a number between 1 and 100
        int searchValue = SafeInput.getRangedInt(
                in, "Enter a number to search for (1-100): ", 1, 100
        );

        // STEP 6: Count how many times the number appears
        int count = 0;

        for (int i = 0; i < dataPoints.length; i++) {

            if (dataPoints[i] == searchValue) {
                count++;
            }
        }

        System.out.println("The value " + searchValue +
                " was found " + count + " times in the array.");

        System.out.println();

        // STEP 7: Find the first position of another number
        int searchValue2 = SafeInput.getRangedInt(
                in, "Enter another number to search for (1-100): ", 1, 100
        );

        boolean found = false;

        for (int i = 0; i < dataPoints.length; i++) {

            if (dataPoints[i] == searchValue2) {

                System.out.println("The value " + searchValue2 +
                        " was found at array index " + i + ".");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The value " + searchValue2 +
                    " was not found in the array.");
        }

        System.out.println();

        // STEP 8: Find the minimum and maximum values
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {

            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }

            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        System.out.println();

        // STEP 9: Convert int array into double array
        double[] doublePoints = new double[dataPoints.length];

        for (int i = 0; i < dataPoints.length; i++) {
            doublePoints[i] = dataPoints[i];
        }

        // Test the getAverage method
        System.out.println("Average of dataPoints is: " +
                getAverage(doublePoints));

        in.close();
    }

    // STEP 9: Static method that calculates an array average
    public static double getAverage(double values[]) {

        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum / values.length;
    }
}

