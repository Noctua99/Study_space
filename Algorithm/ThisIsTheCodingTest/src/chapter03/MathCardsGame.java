package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MathCardsGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        int result = 1;
        for (int i = 0; i < row; i++) {
            int minValue = 10000;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < column; j++) {  // 현재 줄에서 '가장 작은 수' 찾기
                int num = Integer.parseInt(st.nextToken());
                minValue = Math.min(minValue, num);
            }
            result = Math.max(result, minValue);    // '가장 작은 수'들 중에서 가장 큰 수 찾기
        }
        System.out.println(result);
    }
}
