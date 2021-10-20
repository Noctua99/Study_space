package chap02;

public class Practice_2_3 {
    public static void main(String[] args) {
        int[] numArray1 = {1, 2, 3, 4, 5};
        int[] numArray2 = numArray1.clone();

        numArray2[3] = 0;

        System.out.print("numArray1 = ");
        for (int data : numArray1) {
            System.out.print(data + " ");
        }
        System.out.println();
        System.out.print("numArray2 = ");
        for (int data : numArray2) {
            System.out.print(data + " ");
        }
    }
}
