public class Zadacha_1 {
    public static void main(String[] args) {
        /*int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        System.out.println("The sum of the elements is " + sum);
    }
}
*/
        /*int[] arr = {1, 2, 3, 4, 5};
        int evenSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
        }

        System.out.println("Sum of the even is: " + evenSum);
    }
}
*/
        int[] arr = {1, 2, 3, 4, 5};
        int evenSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                evenSum += arr[i];
            }
        }

        System.out.println("Sum of the even is: " + evenSum);
    }
}
