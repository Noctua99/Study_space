package chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AntWarrior {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int numOfWarehouses = Integer.parseInt(br.readLine());

        int[] warehouses = new int[numOfWarehouses];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfWarehouses; i++) {
            warehouses[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[numOfWarehouses];
        dp[0] = warehouses[0];
        dp[1] = Math.max(dp[0], warehouses[1]);
        for (int i = 2; i < numOfWarehouses; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + warehouses[i]);
        }

        System.out.println(dp[numOfWarehouses - 1]);
    }
}
