package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个由 0 和 1 组成的矩阵 mat ，请输出一个大小相同的矩阵，其中每一个格子是 mat 中对应位置元素到最近的 0 的距离。
 * <p>
 * 两个相邻元素间的距离为 1 。
 * 输入：mat = [[0,0,0],[0,1,0],[0,0,0]]
 * 输出：[[0,0,0],[0,1,0],[0,0,0]]
 *
 * @author shkstart
 * @create 2022-04-02 13:15
 */
public class Main542 {
    public int[][] updateMatrix(int[][] mat) {
        int[][] p = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        Queue<int[]> queue = new LinkedList<>();
        int m = mat.length;
        int n = mat[0].length;

        boolean[][] visite = new boolean[m][n];
        int[][] dist = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new int[]{i, j});
                    visite[i][j] = true;

                }
            }

        }


        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + p[i][0];
                int ny = y + p[i][1];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visite[nx][ny]) {
                    dist[nx][ny] = dist[x][y] + 1;
                    visite[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }


        }

        return dist;


    }
}
