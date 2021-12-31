package chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakeItOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        int[] dp = new int[number + 1];
        for (int i = 2; i <= number; i++) {
            int min = Integer.MAX_VALUE;
            if (i % 5 == 0) {
                min = Math.min(min, dp[i / 5]);
            }
            if (i % 3 == 0) {
                min = Math.min(min, dp[i / 3]);
            }
            if (i % 2 == 0) {
                min = Math.min(min, dp[i / 2]);
            }
            min = Math.min(min, dp[i - 1]);

            dp[i] = min + 1;
        }

        System.out.println(dp[number]);
    }
}
