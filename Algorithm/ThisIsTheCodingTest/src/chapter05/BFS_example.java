package chapter05;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFS_example {
    static int[][] graph = new int[][]{{}, {2, 3, 8}, {1, 7}, {1, 4, 5}, {3, 5}, {3, 4}, {7}, {2, 6, 8}, {1, 7}};
    static boolean[] visited = new boolean[9];
    static Queue<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) {
        bfs(1);
    }

    public static void bfs(int start) {
        queue.offer(start);
        // 현재 노드를 방문 처리
        visited[start] = true;
        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // 큐에서 하나의 원소를 뽑아 출력
            int v = queue.poll();
            System.out.println(v);
            // 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for (int i : graph[v]) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
