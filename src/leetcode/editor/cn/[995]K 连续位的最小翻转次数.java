/**
 * <p>给定一个二进制数组 <code>nums</code> 和一个整数 <code>k</code> 。</p>
 *
 * <p><strong>k位翻转</strong> 就是从 <code>nums</code> 中选择一个长度为 <code>k</code> 的 <strong>子数组</strong> ，同时把子数组中的每一个 <code>0</code> 都改成 <code>1</code> ，把子数组中的每一个 <code>1</code> 都改成 <code>0</code> 。</p>
 *
 * <p>返回数组中不存在 <code>0</code> 所需的最小 <strong>k位翻转</strong> 次数。如果不可能，则返回&nbsp;<code>-1</code>&nbsp;。</p>
 *
 * <p><strong>子数组</strong> 是数组的 <strong>连续</strong> 部分。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [0,1,0], K = 1
 * <strong>输出：</strong>2
 * <strong>解释：</strong>先翻转 A[0]，然后翻转 A[2]。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [1,1,0], K = 2
 * <strong>输出：</strong>-1
 * <strong>解释：</strong>无论我们怎样翻转大小为 2 的子数组，我们都不能使数组变为 [1,1,1]。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [0,0,0,1,0,1,1,0], K = 3
 * <strong>输出：</strong>3
 * <strong>解释：</strong>
 * 翻转 A[0],A[1],A[2]:&nbsp;A变成 [1,1,1,1,0,1,1,0]
 * 翻转 A[4],A[5],A[6]:&nbsp;A变成 [1,1,1,1,1,0,0,0]
 * 翻转 A[5],A[6],A[7]:&nbsp;A变成 [1,1,1,1,1,1,1,1]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 * <li><code>1 &lt;= k &lt;= nums.length</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>位运算</li><li>数组</li><li>前缀和</li><li>滑动窗口</li></div></div><br><div><li>👍 235</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * K 连续位的最小翻转次数
 *
 * @author MC
 * @date 2022-05-06 22:26:03
 */
class P995_MinimumNumberOfKConsecutiveBitFlips {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P995_MinimumNumberOfKConsecutiveBitFlips().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minKBitFlips(int[] nums, int k) {

            return 0;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
