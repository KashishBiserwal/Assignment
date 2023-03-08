package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr.length-1];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of element to remove: ");
        int index = sc.nextInt();
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }
        for (int i = index; i < arr.length-1; i++) {
            arr2[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
