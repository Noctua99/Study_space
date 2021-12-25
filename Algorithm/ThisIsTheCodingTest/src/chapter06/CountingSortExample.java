package chapter06;

import java.util.Arrays;

public class CountingSortExample {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};

        countingSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void countingSort(int[] arr) {
        int maxValue = findMax(arr);
        int[] countArray = new int[maxValue + 1];

        for (int data : arr) {
            countArray[data]++;
        }

        int index = 0;
        for (int i = 0; i < maxValue + 1; i++) {
            while (countArray[i] --> 0) {
                arr[index] = i;
                index++;
            }
        }
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int data : arr) {
            max = Math.max(data, max);
        }
        return max;
    }
}
