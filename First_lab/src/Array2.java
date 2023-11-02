public class Array2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                suma += arr[i];
            }
        }
        System.out.println("The sum of all even numbers is: " + suma);
    }
}