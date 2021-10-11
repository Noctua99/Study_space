package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가지고 있는 동전 중에서 큰 단위가 항상 작은 단위의 배수이다
// 따라서 가장 큰 단위의 화폐부터 가장 작은 단위의 화폐까지 차례대로 확인하여 거슬러 주면 된다
public class BackChange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int change = Integer.parseInt(br.readLine());
        int[] coins = {500, 100, 50, 10};
        int count = 0;

        // 동전의 종류가 k일 때 time complexity : O(k)
        for (int coin : coins) {
            count += change / coin;
            change %= coin;
        }
        System.out.println(count);
    }
}
