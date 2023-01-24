public class IfElse {
    public static void main(String[] args) {

        //1
        System.out.print("1. ");
        int x = 6;
        int y = 8;
        if(x+y < 10){
            System.out.println("x + y is less than 10.");
        }else{
            System.out.println("x + y is greater than 10.");
        }

        //2
        System.out.print("2. ");
        Boolean isCorrect = true;
        if(isCorrect){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
