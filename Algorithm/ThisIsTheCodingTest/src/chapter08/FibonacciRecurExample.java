package chapter08;

public class FibonacciRecurExample {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
