package Thread;

class EvenThread extends Thread{
    public void run() {
        for(int i=2;i<=100;i++) {
            try {
                if(i%2==0) {
                    Thread.sleep(50);
                    System.out.print(i);
                    System.out.print(" ");
                }
                else{
                    System.out.print("");
                }
            }catch(InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class OddThread extends Thread{
    public void run() {
        for(int i=1;i<=100;i++) {
            try {
                if(i%2!=0) {
                    Thread.sleep(50);
                    System.out.print(i);
                    System.out.print(" ");
                }
                else{
                    System.out.print("");
                }
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(" ");
    }
}

public class EvenOddThread {
    public static void main(String[] args) {
        EvenThread t1= new EvenThread();
        OddThread t2= new OddThread();
        System.out.println("Even number: ");
        t1.start();
        try {
            t1.join();
        }catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Odd number: ");
        t2.start();
    }
}