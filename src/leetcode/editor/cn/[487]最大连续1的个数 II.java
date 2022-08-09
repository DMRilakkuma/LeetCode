/**
 * <p>给定一个二进制数组 <code>nums</code> ，如果最多可以翻转一个 <code>0</code> ，则返回数组中连续 <code>1</code> 的最大个数。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [1,0,1,1,0]
 * <strong>输出：</strong>4
 * <strong>解释：</strong>翻转第一个 0 可以得到最长的连续 1。
 * &nbsp;    当翻转以后，最大连续 1 的个数为 4。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <b>输入：</b>nums = [1,0,1,1,0,1]
 * <b>输出：</b>4
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 * <li><code>nums[i]</code>&nbsp;不是&nbsp;<code>0</code>&nbsp;就是&nbsp;<code>1</code>.</li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>进阶：</strong>如果输入的数字是作为<strong> 无限流 </strong>逐个输入如何处理？换句话说，内存不能存储下所有从流中输入的数字。您可以有效地解决吗？</p>
 * <div><div>Related Topics</div><div><li>数组</li><li>动态规划</li><li>滑动窗口</li></div></div><br><div><li>👍 100</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 最大连续1的个数 II
 *
 * @author MC
 * @date 2022-05-05 23:18:24
 */
class P487_MaxConsecutiveOnesIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P487_MaxConsecutiveOnesIi().new Solution();
        int n = solution.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0});
        System.out.println(n);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int n = nums.length;
            int left = 0;
            int right = 0;
            int count = 0;
            int max = 0;
            while (right < n) {
                if (nums[right] == 0) {
                    count++;
                }
                right++;

                while (count > 1) {
                    if (nums[left] == 0) {
                        count--;
                    }
                    left++;
                }

                max = Math.max(max, right - left);


            }
            return max;

        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
