package chapter05;

public class DFS_example {
    static int[][] graph = new int[][]{{}, {2, 3, 8}, {1, 7}, {1, 4, 5}, {3, 5}, {3, 4}, {7}, {2, 6, 8}, {1, 7}};
    static boolean[] visited = new boolean[9];

    public static void main(String[] args) {
        dfs(1);
    }

    public static void dfs(int v) {
        // 현재 노드를 방문 처리
        visited[v] = true;
        System.out.println(v + " ");
        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for (int i : graph[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
