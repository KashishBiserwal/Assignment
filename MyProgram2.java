class DisplayMessage{
    void printMessage(){
        System.out.println("Hello My Message");
    }
}

class  MyProgram2 {
    public static void main(String[] args){
        DisplayMessage program = new DisplayMessage();
        program.printMessage();
    }
}
