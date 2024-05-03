package Arrays;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("How many days' tempratures?");
            int days = scanner.nextInt();
            int[] tempratures = new int[days];
            int sum = 0;

            for (int i = 0; i < days; i++) {
                System.out.println("Day " + (i + 1) + "'s high temp: ");
                int temp = scanner.nextInt();
                tempratures[i] = temp;
                sum += temp;
            }
            double average = sum / days;
            System.out.println("Average = " + average);

            // count days above average
            int aboveAverage = 0;
            for (int i : tempratures) {
                if (i > average)
                    aboveAverage++;
            }
            System.out.println((aboveAverage) + " days above average");
        }
    }
}
