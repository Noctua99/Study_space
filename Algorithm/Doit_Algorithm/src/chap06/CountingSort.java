package chap06;

public class CountingSort {
    public static void main(String[] args) {
        CountingSort sample = new CountingSort();
        int[] arr = new int[]{7, 2, 3, 5, 7, 1, 4, 6, 7, 5, 0, 1};
        sample.countingSort(arr);
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    public void countingSort(int[] arr) {
        int maximum = 0;
        for (int data : arr) {
            maximum = Math.max(maximum, data);
        }
        int[] countingArray = new int[maximum + 1];
        for (int data : arr) {
            countingArray[data]++;
        }
        for (int i = 1; i <= maximum; i++) {
            countingArray[i] += countingArray[i - 1];
        }
        int[] temp = new int[arr.length];
        for (int data : arr) {
            countingArray[data]--;
            temp[countingArray[data]] = data;
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }
}
