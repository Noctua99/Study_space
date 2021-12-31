package chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloorConstruction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 가로 길이

        int[] dp = new int[N + 1];
        dp[1] = 1;
        dp[2] = 3;
        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 796796;
        }

        System.out.println(dp[N]);
    }
}
