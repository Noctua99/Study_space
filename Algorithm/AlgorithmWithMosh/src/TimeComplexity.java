public class TimeComplexity {
    public void log(int[] numbers) {
        // O(1) constant
        System.out.println(numbers[0]);
        // O(n) linear
        for (int number : numbers)
            System.out.println(number);
        // O(n^2) quadratic
        for (int first : numbers)
            for (int second : numbers)
                System.out.println(first + ", " + second);
        // O(log n) logarithmic
        // binary search
        // O(2^n) quadratic
    }
}
