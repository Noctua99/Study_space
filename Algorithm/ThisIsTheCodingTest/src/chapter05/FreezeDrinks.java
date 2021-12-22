package chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FreezeDrinks {
    static int height;
    static int width;
    static int[][] iceTray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        height = Integer.parseInt(st.nextToken());   // 얼음 틀의 세로 길이
        width = Integer.parseInt(st.nextToken());   // 얼음 틀의 가로 길이

        iceTray = new int[height][width];

        for (int h = 0; h < height; h++) {
            String input = br.readLine();
            for (int w = 0; w < width; w++) {
                iceTray[h][w] = input.charAt(w) - '0';
            }
        }

        int result = 0;
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                if (dfs(h, w)) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    // DFS로 특정한 노드를 방문한 뒤에 연결된 모든 노드들도 방문
    public static boolean dfs(int h, int w) {
        if (h <= -1 || w <= -1 || h >= height || w >= width) {
            return false;
        }
        if (iceTray[h][w] == 0) {
            iceTray[h][w] = 1;
            dfs(h - 1, w);
            dfs(h + 1, w);
            dfs(h, w - 1);
            dfs(h, w + 1);
            return true;
        }
        return false;
    }
}
