package chap02;

import java.io.*;

public class Practice_2_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("키의 최댓값을 구합니다");
        System.out.print("사람 수 : ");
        int headCount = Integer.parseInt(br.readLine());

        int[] heights = new int[headCount];
        for (int i = 0; i < headCount; i++) {
            System.out.print("heights[" + i + "] : ");
            heights[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("최댓값은 " + maxOf(heights) + "입니다");
    }

    public static int maxOf(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            maxValue = Math.max(maxValue, numbers[i]);
        }
        return maxValue;
    }
}
