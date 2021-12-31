package chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EfficientMoneyComposition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numOfMoneys = Integer.parseInt(st.nextToken());
        int targetAmount = Integer.parseInt(st.nextToken());

        int[] moneys = new int[numOfMoneys];
        for (int i = 0; i < numOfMoneys; i++) {
            moneys[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[targetAmount + 1];
        Arrays.fill(dp, 10001);
        dp[0] = 0;

        for (int i = 0; i < numOfMoneys; i++) {
            for (int j = moneys[i]; j <= targetAmount; j++) {
                dp[j] = Math.min(dp[j], dp[j - moneys[i]] + 1);
            }
        }
        System.out.println(dp[targetAmount]);
    }
}
