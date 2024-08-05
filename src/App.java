import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int[] counts = new int[10];

        // Generate and count 100 random integers between 0 and 9
        for (int i = 0; i < 100; i++) {
            counts[random.nextInt(10)]++;
        }

        // Display the count for each number
        System.out.println("Counts for each number from 0 to 9:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }
}