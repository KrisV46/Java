//Да се напише програма, която проверява дали между елементите на редицата
// а0, а1, а2,..., аn са изпълнени релациите: а0 < a1 > a2 < a3

public class Main {
    public static boolean checkSequence(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        for (int i = 0; i < arr.length - 2; i++) {
            if (i % 2 == 0) {
                if (!(arr[i] < arr[i + 1])) {
                    return false;
                }
            } else {
                if (!(arr[i] > arr[i + 1])) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] sequence = {1, 5, 2, 4, 3,};
        boolean result = checkSequence(sequence);

        if (result) {
            System.out.println("Редицата изпълнява условието.");
        } else {
            System.out.println("Редицата НЕ изпълнява условието.");
        }
    }
}

































    /*
    import java.util.Scanner;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя на елементите в редицата: ");
        int n = scanner.nextInt();

        int[] sequence = new int[n];

        System.out.println("Въведете стойностите на редицата:");

        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        scanner.close();

        boolean result = checkSequence(sequence);

        if (result) {
            System.out.println("Редицата изпълнява условието.");
        } else {
            System.out.println("Редицата НЕ изпълнява условието.");
        }
    }
}
*/