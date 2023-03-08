package Arrays;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        int[] newArray = new int[arr.length+1];
        int index = 2;
        int value = 10;
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        newArray[index] = value;
        for (int i = index; i < arr.length; i++) {
            newArray[i+1] = arr[i];
        }
        System.out.println("New array: " + Arrays.toString(newArray));
    }
}
