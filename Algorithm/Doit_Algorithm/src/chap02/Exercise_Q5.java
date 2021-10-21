package chap02;


public class Exercise_Q5 {
    public static void main(String[] args) {
        int[] numArray1 = new int[]{1, 2, 3, 4, 5};
        int[] numArray2 = new int[5];
        rcopy(numArray1, numArray2);
        for (int number : numArray2) {
            System.out.println(number);
        }
    }

    public static void rcopy(int[] numArray1, int[] numArray2) {
        for (int i = 0; i < numArray1.length; i++) {
            numArray2[numArray1.length - i - 1] = numArray1[i];
        }
    }
}
