package chap02;

public class Practice_2_12 {
    public static void main(String[] args) {
        int[][] numArray = new int[2][4];

        numArray[0][1] = 37;
        numArray[0][3] = 54;
        numArray[1][2] = 65;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("numArray[" + i + "][" + j + "] = " + numArray[i][j]);
            }
        }
    }
}
