package Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {4, 6, 75, 3, 12, 1, 29, 60, 22};
        int even = 0, odd= 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0 || arr[i] == 1 ) continue;
            if(arr[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
