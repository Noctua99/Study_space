package chap06;

public class HeapSort {
    public static void main(String[] args) {
        int[] a = new int[]{22, 5, 11, 32, 120, 68, 70};
        heapSort(a, a.length);
        for (int data : a) {
            System.out.print(data+" ");
        }
    }

    public static void downHeap(int[] a, int left, int right) {
        int temp = a[left];
        int child;
        int parent;

        for (parent = left; parent < (right + 1) / 2; parent = child) {
            int cl = parent * 2 + 1;
            int cr = cl + 1;
            child = (cr <= right && a[cr] > a[cl]) ? cr : cl;
            if (temp >= a[child]) break;
            a[parent] = a[child];
        }
        a[parent] = temp;
    }

    public static void heapSort(int[] a, int n) {
        for (int i = (n - 1) / 2; i >= 0; i--) {
            downHeap(a, i, n - 1);
        }

        for (int i = n - 1; i > 0; i--) {
            swap(a, 0, i);
            downHeap(a, 0, i - 1);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
