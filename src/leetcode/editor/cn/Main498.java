package leetcode.editor.cn;

/**
 * 给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，用一个数组返回这个矩阵中的所有元素。
 * 输入：mat = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,4,7,5,3,6,8,9]
 * <p>
 * 输入：mat = [[1,2],[3,4]]
 * 输出：[1,2,3,4]
 *
 * @author MC
 * @create 2022-04-20 18:21
 * @Description: 对角线遍历
 */
public class Main498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] store = new int[m * n];
        int x = 0;
        int y = 0;
        int sum = x + y;
        int index = 0;
        while (sum < m + n) {
            if (sum % 2 == 0) {
                store[index] = mat[x][y];
                if(index == m * n -1){
                    break;
                }
                index++;
                if( y == n-1){
                    x = x +1 ;
                }else{

                    x = x - 1 < 0 ? 0 : x - 1;
                    y = y + 1 < n ? y + 1 : n - 1;
                }
                sum = x + y;

            }
            if (sum >= m + n ) {
                break;
            }
            if (sum % 2 == 1) {
                store[index] = mat[x][y];
                if(index == m * n -1){
                    break;
                }
                index++;
                if(x == m-1){
                    y = y+1;
                }else{
                    x = x + 1 < m ? x + 1 : m - 1;
                    y = y - 1 < 0 ? 0 : y - 1;

                }

                sum = x+y;

            }


        }


        return store;


    }
}
