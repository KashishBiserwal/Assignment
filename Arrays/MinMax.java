package Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {4, 6, 75, 3, 1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1])
                max = arr[i];
            if(arr[i] < arr[i-1])
                min = arr[i];
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
