package chap02;

public class Practice_2_9 {
    public static void main(String[] args) {
        int count = 0;

        System.out.println(2);
        for (int num = 3; num <= 1000; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                count++;
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
            }
        }
        System.out.println("The total count of operations : " + count);
    }
}
