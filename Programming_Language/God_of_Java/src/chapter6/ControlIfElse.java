package chapter6;

public class ControlIfElse {
    public static void main(String[] args) {
        ControlIfElse control=new ControlIfElse();
        control.IfElseStatement();
    }
    public void IfElseStatement(){
        int intValue=10;

        if(intValue>5) System.out.println("It's bigger than 5");
        else System.out.println("It's smaller or equal than 5");

        if(intValue<=5)
            System.out.println("It's smaller or equal than 5");
        else
            System.out.println("It's bigger than 5");
    }
}
