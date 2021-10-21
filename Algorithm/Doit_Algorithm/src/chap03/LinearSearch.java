package chap03;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numArray = new int[]{22, 8, 55, 32, 120, 55, 70};
        int key = 55;
        int index = find(numArray, numArray.length, key);
        if (index > -1) {
            System.out.println(key + "는 numArray[" + index + "]에 있습니다");
        } else {
            System.out.println("can't find " + key + " in numArray");
        }
    }

    static int find(int[] numArray, int length, int key) {
        for (int i = 0; i < length; i++) {
            if (numArray[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
