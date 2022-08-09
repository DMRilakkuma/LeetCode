/**
 * <p>给你一个正整数 <code>n</code> ，生成一个包含 <code>1</code> 到 <code>n<sup>2</sup></code> 所有元素，且元素按顺时针顺序螺旋排列的 <code>n x n</code> 正方形矩阵 <code>matrix</code> 。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/spiraln.jpg" style="width: 242px; height: 242px;" />
 * <pre>
 * <strong>输入：</strong>n = 3
 * <strong>输出：</strong>[[1,2,3],[8,9,4],[7,6,5]]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>n = 1
 * <strong>输出：</strong>[[1]]
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 <= n <= 20</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>矩阵</li><li>模拟</li></div></div><br><div><li>👍 705</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 螺旋矩阵 II
 *
 * @author MC
 * @date 2022-05-11 16:10:32
 */
class P59_SpiralMatrixIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P59_SpiralMatrixIi().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] generateMatrix(int n) {
            int nums[][] = new int[n][n];
            int left = 0;
            int right = n -1;
            int downLeft = 0;
            int downRight = n -1;
            int count = 1;

            while(count <= n*n){
                for (int i = left; i <= right; i++) {
                    nums[left][i] = count++;
                }
                left++;
                for (int i = left; i <= downRight; i++) {
                    nums[i][downRight] = count++;
                }
                downRight--;
                for (int i = downRight; i >= downLeft ; i--) {
                    nums[right][i] = count++;
                }
                right--;
                for (int i = right; i >= left ; i--) {
                    nums[i][downLeft] = count++;
                }
                downLeft++;
            }

            return nums;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
