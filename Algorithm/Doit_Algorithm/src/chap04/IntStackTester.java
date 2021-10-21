package chap04;

public class IntStackTester {
    public static void main(String[] args) {
        IntStack intStack = new IntStack(64);

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        System.out.println(intStack.pop() + " is popped");
        System.out.println("stack capacity is " + intStack.capacity());
        System.out.println(intStack.peek());
        System.out.println(intStack.isEmpty());
    }
}
