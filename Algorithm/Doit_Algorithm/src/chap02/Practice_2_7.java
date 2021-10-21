package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_2_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Number of elements : ");
        int arrayLength1 = Integer.parseInt(br.readLine());

        int[] numArray1 = new int[arrayLength1];
        System.out.println("Fill in the array");
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrayLength1; i++) {
            numArray1[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print("Number of elements : ");
        int arrayLength2 = Integer.parseInt(br.readLine());

        int[] numArray2 = new int[arrayLength2];
        System.out.println("Fill in the array");
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrayLength2; i++) {
            numArray2[i] = Integer.parseInt(st.nextToken());
        }

        if (equals(numArray1, numArray2)) {
            System.out.println("Array a and b is same");
        } else {
            System.out.println("Array a and b are not the same");
        }
    }

    public static boolean equals(int[] numArray1, int[] numArray2) {
        if (numArray1.length != numArray2.length)
            return false;
        for (int i = 0; i < numArray1.length; i++) {
            if (numArray1[i] != numArray2[i]) {
                return false;
            }
        }
        return true;
    }
}
