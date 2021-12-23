package chapter06;

import java.util.Arrays;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        selectionSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void selectionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
