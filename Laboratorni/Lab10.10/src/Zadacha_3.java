import java.util.Scanner;

public class Zadacha_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input values into the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value for element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        // Find the maximum and minimum values
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        // Print the results
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}
