import java.util;

public class ps1{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare an array of the specified size
        int[] array = new int[size];

        // Get array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Calculate the sum using IntStream
        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        // Display the result
        System.out.println("Sum of array elements: " + sum);

        // Close the Scanner
        scanner.close();
    }
}
