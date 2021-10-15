package chapter04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UpDownLeftRight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int size = Integer.parseInt(br.readLine());

        int x = 1;
        int y = 1;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 100; i++) {
            if (!st.hasMoreTokens()) break;
            String input = st.nextToken();
            switch (input) {
                case "U":
                    if (y == 1) continue;
                    y--;
                    break;
                case "D":
                    if (y == size) continue;
                    y++;
                    break;
                case "R":
                    if (x == size) continue;
                    x++;
                    break;
                case "L":
                    if (y == 1) continue;
                    x--;
                    break;
            }
        }
        System.out.println(y + " " + x);
    }
}
