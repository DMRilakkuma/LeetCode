package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 * @author shkstart
 * @create 2022-04-19 22:08
 *
 * 输入：
 * [
 *   [1,1,1],
 *   [1,0,1],
 *   [1,1,1]
 * ]
 * 输出：
 * [
 *   [1,0,1],
 *   [0,0,0],
 *   [1,0,1]
 * ]
 */

public class 零矩阵 {
    public void setZeroes(int[][] matrix) {
        Queue <int []> queue = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0){
                  queue.add(new int[]{i,j});
                }
            }
        }

       while(!queue.isEmpty()){
           int[] poll = queue.poll();
           for (int i = 0; i < matrix.length; i++) {
               matrix[i][poll[1]] = 0;
           }
           for (int i = 0; i < matrix[poll[0]].length; i++) {
               matrix[poll[0]][i] = 0;

           }
       }



    }


}
