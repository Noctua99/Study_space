package chapter06;

import java.util.Arrays;

public class QuickSortExample {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

        System.out.println(Arrays.toString(numbers));
        quickSort(numbers, 0, numbers.length - 1);

        System.out.println(Arrays.toString(numbers));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            System.out.println(Arrays.toString(arr));

            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int lo = left;
        int hi = right;
        int pivot = arr[left];

        while(lo < hi) {
            while(arr[hi] > pivot && lo < hi) {
                hi--;
            }

            while(arr[lo] <= pivot && lo < hi) {
                lo++;
            }
            swap(arr, lo, hi);
        }
        swap(arr, left, lo);

        return lo;
    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("swap: " + arr[i] + " " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
