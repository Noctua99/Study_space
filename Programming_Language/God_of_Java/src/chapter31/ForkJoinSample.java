package chapter31;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinSample {
    static final ForkJoinPool mainPool = new ForkJoinPool();

    public static void main(String[] args) {
        ForkJoinSample sample = new ForkJoinSample();
        long start = System.nanoTime();
        sample.calculate();
        long end = System.nanoTime();
        System.out.println("calculate1 runtime: " + (end - start) / 1000000000.0 + " s");
        start = System.nanoTime();
        sample.calculate2();
        end = System.nanoTime();
        System.out.println("calculate1 runtime: " + (end - start) / 1000000000.0 + " s");
    }

    public void calculate() {
        long from = 0;
        long to = 1_000_000_000L;

        GetSum sum = new GetSum(from, to);
        Long result = mainPool.invoke(sum);
        System.out.println("Fork Join:Total sum of " + from + " ~ " + to + " = " + result);
    }

    public void calculate2() {
        long from = 0;
        long to = 1_000_000_000L;

        long result = 0;
        for (long i = from; i <= to; i++) {
            result += i;
        }
        System.out.println("ForLoop:Total sum of " + from + " ~ " + to + " = " + result);
    }
}
