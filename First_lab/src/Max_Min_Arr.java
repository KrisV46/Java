public class Max_Min_Arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > min){
                max = arr[i];
            } else if (arr[i] < max) {
                min = arr[i];

            }
        }
        System.out.println("Минимална стойност: " + min);
        System.out.println("Максимална стойност: " + max);
    }
}
