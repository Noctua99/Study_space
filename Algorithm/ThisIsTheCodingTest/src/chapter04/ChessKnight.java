package chapter04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChessKnight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String start = br.readLine();
        int x = start.charAt(0) - 96;
        int y = start.charAt(1) - 48;

        int[][] move = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};
        int count = 8;
        for (int i = 0; i < 8; i++) {
            if (x + move[i][0] > 8 || x + move[i][0] <= 0 || y + move[i][1] > 8 || y + move[i][1] <= 0) {
                count--;
            }
        }
        System.out.println(count);
    }
}
