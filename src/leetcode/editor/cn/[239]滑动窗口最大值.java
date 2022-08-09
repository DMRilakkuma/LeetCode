/**
 * <p>给你一个整数数组 <code>nums</code>，有一个大小为&nbsp;<code>k</code><em>&nbsp;</em>的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 <code>k</code>&nbsp;个数字。滑动窗口每次只向右移动一位。</p>
 *
 * <p>返回 <em>滑动窗口中的最大值 </em>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <b>输入：</b>nums = [1,3,-1,-3,5,3,6,7], k = 3
 * <b>输出：</b>[3,3,5,5,6,7]
 * <b>解释：</b>
 * 滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       <strong>3</strong>
 * 1 [3  -1  -3] 5  3  6  7       <strong>3</strong>
 * 1  3 [-1  -3  5] 3  6  7      <strong> 5</strong>
 * 1  3  -1 [-3  5  3] 6  7       <strong>5</strong>
 * 1  3  -1  -3 [5  3  6] 7       <strong>6</strong>
 * 1  3  -1  -3  5 [3  6  7]      <strong>7</strong>
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <b>输入：</b>nums = [1], k = 1
 * <b>输出：</b>[1]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><b>提示：</b></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 * <li><code>-10<sup>4</sup>&nbsp;&lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
 * <li><code>1 &lt;= k &lt;= nums.length</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>队列</li><li>数组</li><li>滑动窗口</li><li>单调队列</li><li>堆（优先队列）</li></div></div><br><div><li>👍 1601</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.LinkedList;

/**
 * 滑动窗口最大值
 *
 * @author MC
 * @date 2022-05-07 21:31:12
 */
class P239_SlidingWindowMaximum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P239_SlidingWindowMaximum().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            int[] ans = new int[n - k + 1];
            LinkedList<Integer> queue = new LinkedList<>();
            int left = 0;
            int right = 0;
            while (right < n) {
                while (!queue.isEmpty() && nums[right] >= nums[queue.peekLast()]) {
                    queue.removeLast();

                }
                queue.addLast(right);

                if (queue.peekFirst() < left) {
                    queue.removeFirst();
                }
                if (right >= k - 1) {
                    ans[left] = nums[queue.peekFirst()];
                    left++;
                }
                right++;
            }

            return ans;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
