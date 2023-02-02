package controlStatement.Questions;
 /* 4.           1
                1 1
               1 2 1
              1 3 3 1
             1 4 6 4 1
*/
public class Q4 {
    public static void main(String[] args) {
        int n = 5;
        for(int i =0; i<n; i++){
            for(int j = n; j>=i; j--){
                System.out.print(" ");
            }
            int num = (int)Math.pow(11, i);
            for(char c: ("" + num).toCharArray()){ //convert int to character Array
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
