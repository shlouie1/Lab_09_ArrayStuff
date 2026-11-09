import java.util.Random;
import java.util.Scanner;

public class partTwo {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        String prompt = "Enter in a number ";

        double[] dataPoints = new double[100];
        Random rnd = new Random();

        for (int randIterator = 0; randIterator < 100; randIterator++) {
            dataPoints[randIterator] = rnd.nextDouble(1, 101);
        }

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(double values[]) {
        double sum = 0;
        for (int avgIterator = 0; avgIterator < values.length; avgIterator++) {
            sum += values[avgIterator];
        }
        double average = sum / values.length;
        return average;
    }
}
