import java.util.Random;

public class partOne {
    public static void main (String[] args) {
        int[] dataPoints = new int[100];
        Random rnd = new Random();

        for (int randIterator = 0; randIterator < 100; randIterator++) {
            dataPoints[randIterator] = rnd.nextInt(1, 101);
        }

        for (int displayIterator = 0; displayIterator < 100; displayIterator++) {
            System.out.print(dataPoints[displayIterator] + " | ");
        }
        System.out.println();

        int sum = 0;
        for (int sumIterator = 0; sumIterator < 100; sumIterator++) {
            sum += dataPoints[sumIterator];
        }

        int average = (sum / 100);

        System.out.printf("\nSum of values is %d", sum);
        System.out.printf("\nAverage of values is %d", average);




    }
}