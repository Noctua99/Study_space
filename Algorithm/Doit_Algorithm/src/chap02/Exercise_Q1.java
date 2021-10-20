package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Exercise_Q1 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        System.out.println("키의 최댓값을 구합니다");
        System.out.print("사람 수 : ");
        int headCount = random.nextInt(100);

        int[] heights = new int[headCount];

        System.out.println("키 값은 아래와 같습니다");
        for (int i = 0; i < headCount; i++) {
            heights[i] = 100 + random.nextInt(90);
            System.out.println("heights[" + i + "] : " + heights[i]);
        }
        System.out.println("최댓값은 " + maxOf(heights) + "입니다");


    }

    public static int maxOf(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            maxValue = Math.max(maxValue, numbers[i]);
        }
        return maxValue;
    }
}
