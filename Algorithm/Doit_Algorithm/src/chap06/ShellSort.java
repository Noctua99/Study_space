package chap06;

public class ShellSort {
    public static void main(String[] args) {
        ShellSort sample = new ShellSort();
        int[] arr = new int[]{8, 1, 4, 2, 7, 6, 3, 5};

        sample.shellSort2(arr, arr.length);
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    public void shellSort(int[] arr, int length) {
        for (int h = length / 2; h > 0; h /= 2) {
            for (int i = h; i < length; i++) {
                int j;
                int temp = arr[i];
                for (j = i - h; j >= 0 && arr[j] > temp; j -= h) {
                    arr[j + h] = arr[j];
                }
                arr[j + h] = temp;
            }
        }
    }

    public void shellSort2(int[] arr, int length) {
        int h;
        for (h = 1; h < length / 9; h = h * 3 + 1)
            ;

        for (; h > 0; h /= 3)
            for (int i = h; i < length; i++) {
                int j;
                int temp = arr[i];
                for (j = i - h; j >= 0 && arr[j] > temp; j -= h)
                    arr[j + h] = arr[j];
                arr[j + h] = temp;
            }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
