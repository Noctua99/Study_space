package chap02;

import java.util.ArrayList;

public class Practice_2_11 {
    public static void main(String[] args) {
        int count = 0;
        ArrayList<Integer> primeNumber = new ArrayList<>();
        primeNumber.add(2);

        for (int num = 3; num <= 1000; num += 2) {
            boolean isPrime = true;
            for (int i = 0; primeNumber.get(i) * primeNumber.get(i) <= num; i++) {
                count += 2;
                if (num % primeNumber.get(i) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumber.add(num);
            }
        }
        for (int prime : primeNumber) {
            System.out.println(prime);
        }
        System.out.println("The total count of operations : " + count);
    }
}
