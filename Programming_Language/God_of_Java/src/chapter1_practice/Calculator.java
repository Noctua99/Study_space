package chapter1_practice;

public class Calculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(5, 5));
        System.out.println(cal.subtract(7, 5));
        System.out.println(cal.multiply(2, 4));
        System.out.println(cal.divide(14, 2));
    }

    public int add(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    public int subtract(int num1, int num2) {
        int result;
        result = num1 - num2;
        return result;
    }

    public int multiply(int num1, int num2) {
        int result;
        result = num1 * num2;
        return result;
    }

    public int divide(int num1, int num2) {
        int result;
        result = (int) (num1 / num2);
        return result;
    }
}
