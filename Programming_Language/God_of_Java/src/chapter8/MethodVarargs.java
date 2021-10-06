package chapter8;

public class MethodVarargs {
    public static void main(String[] args) {
        MethodVarargs varargs = new MethodVarargs();
        varargs.calculateNumberSWithArray(new int[]{1, 2, 3, 4, 5});
        varargs.calculateNumbers(1, 2, 3, 4, 5);
    }

    public void calculateNumberSWithArray(int[] numbers) {

    }

    public void calculateNumbers(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Total = " + total);
    }
}
