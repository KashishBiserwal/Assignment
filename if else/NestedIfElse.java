public class NestedIfElse {
    public static void main(String[] args) {

        //1
        System.out.print("1. ");
        String address = "Kolkata, India";
        if(address.endsWith("India")){
            if(address.contains("Dunlop")){
                System.out.println("Your city is Dunlop.");
            }else if(address.contains("NewTown")){
                System.out.println("Your city is NewTown.");
            }else{
                System.out.println(address.split(",")[0]);
            }
        }else{
            System.out.println("You are not living in India.");
        }

        //2
        System.out.print("2. ");
        int a = 20;
        int b = 5;
        if(a>b){
            System.out.println("a > b");
            if(b > 10){
                System.out.println("b > 10");
            }else{
                System.out.println("b <= 10");
            }
        }else if(a < b){
            System.out.println("a < b");
        }else{
            System.out.println("a = b");
        }
    }
}
