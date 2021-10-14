import java.util.Arrays;

public class Array {
    private int[] arr;
    private int count = 0;

    public Array() {

    }

    public Array(int length) {
        arr = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void insert(int item) {
        if (count == arr.length) {
            int[] tempArr = new int[count + 1];
            for (int i = 0; i < count; i++) {
                tempArr[i] = arr[i];
            }
            arr = tempArr;
        }
        arr[count] = item;
        count++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }
        count--;
    }

    public int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
