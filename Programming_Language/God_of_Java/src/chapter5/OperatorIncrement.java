package chapter5;

public class OperatorIncrement {
    public static void main(String[] args) {
        OperatorIncrement operator = new OperatorIncrement();
        operator.increment();
    }

    public void increment() {
        int intValue = 1;
        System.out.println(intValue++);
        System.out.println(intValue);
        System.out.println(++intValue);
    }
}
