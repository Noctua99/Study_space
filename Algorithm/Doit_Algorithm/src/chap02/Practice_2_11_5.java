package chap02;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice_2_11_5 {
    static final int MAX_NUM = 1000000;

    public static void main(String[] args) {
        boolean[] primeChecker = new boolean[MAX_NUM + 1];
        Arrays.fill(primeChecker, true);
        long count = 0;
        ArrayList<Integer> primeNumber = new ArrayList<>();

        for (int i = 2; i * i <= MAX_NUM; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= MAX_NUM; j += i) {
                    count++;
                    primeChecker[j] = false;
                }
            }
        }
        for (int i = 2; i <= MAX_NUM; i++) {
            if (primeChecker[i]) {
                primeNumber.add(i);
            }
        }
//        for (int prime : primeNumber) {
//            System.out.println(prime);
//        }
        System.out.println("The total count of operations : " + count);
    }
}
