import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Step 1: Define a List of integers with duplicates
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // duplicate
        numbers.add(30);
        numbers.add(40);
        numbers.add(20); // duplicate

        try {
            // Step 2: Use a Set to remove duplicates
            Set<Integer> uniqueNumbersSet = new HashSet<>(numbers);
            List<Integer> uniqueNumbers = new ArrayList<>(uniqueNumbersSet);

            // Step 3: Calculate the sum and average of the integers
            int sum = calculateSum(uniqueNumbers);
            double average = calculateAverage(uniqueNumbers, sum);

            // Step 4: Print the sum, average, and the list of integers without duplicates
            System.out.println("List of integers without duplicates: " + uniqueNumbers);
            System.out.println("Sum of unique integers: " + sum);
            System.out.println("Average of unique integers: " + average);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }

    private static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static double calculateAverage(List<Integer> numbers, int sum) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("The list of numbers is empty.");
        }
        return sum / (double) numbers.size();
    }
}
