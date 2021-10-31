package chapter04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GameDevelopment {
    static int h;
    static int w;
    static int direction;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());

        int[][] field = new int[height][width];
        for (int h = 0; h < height; h++) {
            st = new StringTokenizer(br.readLine());
            for (int w = 0; w < width; w++) {
                field[h][w] = Integer.parseInt(st.nextToken());
            }
        }

        boolean[][] isVisited = new boolean[height][width];     // 방문여부 확인
        int visitCount = 0;
        isVisited[h][w] = true;
        visitCount++;

        while (true) {
            int initialH = h;
            int initialW = w;
            for (int i = 0; i < 4; i++) {
                direction--;
                if (direction < 0) direction += 4;
                move(direction);
                System.out.println("move : " + h + " " + w);
                System.out.println("direction : " + direction);
                if (h >= height || h < 0 || w >= width || w < 0 || isVisited[h][w] || field[h][w] == 1) {
                    move(direction - 2);
                    System.out.println("back : " + h + " " + w);
                } else {
                    isVisited[h][w] = true;
                    System.out.println("육지 도착");
                    visitCount++;
                    break;
                }
            }
            if (initialH == h && initialW == w) {
                move(direction - 2);
                if (field[h][w] == 1) break;
            }
        }
        System.out.println(visitCount);
    }

    public static void move(int direction) {
        if (direction < 0) direction += 4;
        switch (direction) {
            case 0:
                h--;
                break;
            case 1:
                w++;
                break;
            case 2:
                h++;
                break;
            case 3:
                w--;
                break;
        }
    }
}
