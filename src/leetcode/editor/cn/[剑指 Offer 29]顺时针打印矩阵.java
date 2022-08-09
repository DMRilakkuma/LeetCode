package leetcode.editor.cn;

import java.util.Arrays;

class ShunShiZhenDaYinJuZhenLcof {
    public static void main(String[] args) {
        Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[] ints = solution.spiralOrder(arr);
        System.out.println(Arrays.toString(ints));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            if (matrix.length == 0) {
                return new int[0];
            }
            int m = matrix.length - 1;
            int n = matrix[0].length - 1;
            int upper = 0;
            int lower = m - 1;
            int left = 0;
            int right = n - 1;

            int[] arr = new int[m * n];
            int index = 0;
            while (true) {

                for (int i = left; i <= right; i++) {
                    arr[index++] = matrix[upper][i];
                }

                if (++upper > lower) {
                    break;
                }

                for (int i = upper; i <= lower; i++) {
                    arr[index++] = matrix[i][right];
                }

                if (--right < left) {
                    break;
                }

                for (int i = right; i >= left; i--) {
                    arr[index++] = matrix[lower][i];
                }

                if (--lower < upper) {
                    break;
                }

                for (int i = lower; i >= upper; i--) {
                    arr[index++] = matrix[i][left];
                }

                if (++left > right) {
                    break;
                }
            }
            return arr;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}