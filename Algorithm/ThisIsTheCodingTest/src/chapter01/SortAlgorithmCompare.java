package chapter01;

import java.util.Arrays;

public class SortAlgorithmCompare {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        double estimatedTime;
        int[] testArray;


        startTime = System.nanoTime();
        testArray = new int[10000];
        for (int i = 0; i < 10000; i++) {
            testArray[i] = (int) Math.floor(Math.random() * 100 + 1);
        }

        for (int i = 0; i < 10000; i++) {
            int minIndex = i;
            for (int j = i + 1; j < 10000; j++) {
                if (testArray[minIndex] > testArray[j]) {
                    minIndex = j;
                }
            }
            int temp = testArray[i];
            testArray[i] = testArray[minIndex];
            testArray[minIndex] = temp;
        }

        endTime = System.nanoTime();
        estimatedTime = (endTime - startTime) / 1000000000.0;
        System.out.println("Selection Sort estimatedTime : " + estimatedTime + "sec");

        startTime = System.nanoTime();
        testArray = new int[10000];
        for (int i = 0; i < 10000; i++) {
            testArray[i] = (int) Math.floor(Math.random() * 100 + 1);
        }

        Arrays.sort(testArray);

        endTime = System.nanoTime();
        estimatedTime = (endTime - startTime) / 1000000000.0;
        System.out.println("Arrays.sort() estimatedTime : " + estimatedTime + "sec");
    }
}
