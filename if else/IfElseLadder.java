public class IfElseLadder {
    public static void main(String[] args) {

        //1
        System.out.print("1. ");
        String name = "Riya";
        if(name == "Meena"){
            System.out.println("Name is Meena");
        }else if(name == "Neha"){
            System.out.println("Name is Neha");
        }else if(name == "Amit"){
            System.out.println("Name is Amit");
        }else{
            System.out.println(name);
        }

        //2
        System.out.print("2. ");
        int num = 100;
        if(num > 100){
            System.out.println("Number is greater than 100");
        }else if(num < 100){
            System.out.println("Number is less than 100");
        }else{
            System.out.println("Number is equal to 100");
        }
    }
}
