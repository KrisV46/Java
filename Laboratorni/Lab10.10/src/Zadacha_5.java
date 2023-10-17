public class Zadacha_5 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        int sumdiagonal1 = 0;
        for(int i = 0; i < matrix.length; i++){

            sumdiagonal1 += matrix[i][i];
        }
        System.out.println("Sum of diagonal 1: "+sumdiagonal1);
        int sumdiagonal2 = 0;
        for(int i = 0; i < matrix.length; i++){

            sumdiagonal2 += matrix[i][matrix.length - 1 - i];
        }
        System.out.println("Sum of diagonal 2: "+sumdiagonal2);
        int sum = sumdiagonal1+sumdiagonal2;
        System.out.println("Te: "+sum);
    }
}

