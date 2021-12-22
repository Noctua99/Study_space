package chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class EscapeMaze {
    static int height;
    static int width;
    static int[][] maze;
    static int[] dh = {-1, 1, 0, 0};
    static int[] dw = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        height = Integer.parseInt(st.nextToken());   // 미로의 세로 길이
        width = Integer.parseInt(st.nextToken());   // 미로의 가로 길이

        maze = new int[height][width];

        for (int h = 0; h < height; h++) {
            String input = br.readLine();
            for (int w = 0; w < width; w++) {
                maze[h][w] = input.charAt(w) - '0';
            }
        }

        System.out.println(bfs(0, 0));
    }

    // DFS로 특정한 노드를 방문한 뒤에 연결된 모든 노드들도 방문
    public static int bfs(int h, int w) {
        Queue<Integer> heightQueue = new ArrayDeque<>();
        Queue<Integer> widthQueue = new ArrayDeque<>();
        heightQueue.offer(h);
        widthQueue.offer(w);
        while (!heightQueue.isEmpty() && !widthQueue.isEmpty()) {
            h = heightQueue.poll();
            w = widthQueue.poll();
            for (int i = 0; i < 4; i++) {
                int nowH = h + dh[i];
                int nowW = w + dw[i];
                if (nowH < 0 || nowW < 0 || nowH >= height || nowW >= width) {
                    continue;
                }
                if (maze[nowH][nowW] == 0) {
                    continue;
                }
                if (maze[nowH][nowW] == 1) {
                    maze[nowH][nowW] = maze[h][w] + 1;
                    heightQueue.offer(nowH);
                    widthQueue.offer(nowW);
                }
            }
        }
        return maze[height - 1][width - 1];
    }
}
