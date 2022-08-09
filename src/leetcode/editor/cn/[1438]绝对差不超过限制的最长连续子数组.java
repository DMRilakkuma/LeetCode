/**
 * <p>给你一个整数数组 <code>nums</code> ，和一个表示限制的整数 <code>limit</code>，请你返回最长连续子数组的长度，该子数组中的任意两个元素之间的绝对差必须小于或者等于 <code>limit</code><em> 。</em></p>
 *
 * <p>如果不存在满足条件的子数组，则返回 <code>0</code> 。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>nums = [8,2,4,7], limit = 4
 * <strong>输出：</strong>2
 * <strong>解释：</strong>所有子数组如下：
 * [8] 最大绝对差 |8-8| = 0 &lt;= 4.
 * [8,2] 最大绝对差 |8-2| = 6 &gt; 4.
 * [8,2,4] 最大绝对差 |8-2| = 6 &gt; 4.
 * [8,2,4,7] 最大绝对差 |8-2| = 6 &gt; 4.
 * [2] 最大绝对差 |2-2| = 0 &lt;= 4.
 * [2,4] 最大绝对差 |2-4| = 2 &lt;= 4.
 * [2,4,7] 最大绝对差 |2-7| = 5 &gt; 4.
 * [4] 最大绝对差 |4-4| = 0 &lt;= 4.
 * [4,7] 最大绝对差 |4-7| = 3 &lt;= 4.
 * [7] 最大绝对差 |7-7| = 0 &lt;= 4.
 * 因此，满足题意的最长子数组的长度为 2 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>nums = [10,1,2,4,7,2], limit = 5
 * <strong>输出：</strong>4
 * <strong>解释：</strong>满足题意的最长子数组是 [2,4,7,2]，其最大绝对差 |2-7| = 5 &lt;= 5 。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>nums = [4,2,2,2,4,4,2,2], limit = 0
 * <strong>输出：</strong>3
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 10^5</code></li>
 * <li><code>1 &lt;= nums[i] &lt;= 10^9</code></li>
 * <li><code>0 &lt;= limit &lt;= 10^9</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>队列</li><li>数组</li><li>有序集合</li><li>滑动窗口</li><li>单调队列</li><li>堆（优先队列）</li></div></div><br><div><li>👍 238</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 绝对差不超过限制的最长连续子数组
 *
 * @author MC
 * @date 2022-05-08 22:36:28
 */
class P1438_LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1438_LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestSubarray(int[] nums, int limit) {
            Deque<Integer> Maxqueue = new LinkedList<Integer>();
            Deque<Integer> Minqueue = new LinkedList<Integer>();
            int left = 0;
            int right = 0;
            int max = 0;
            while (right < nums.length) {
                while (!Maxqueue.isEmpty() && Maxqueue.peekLast() < nums[right]) {
                    Maxqueue.removeLast();
                }
                while (!Minqueue.isEmpty() && Minqueue.peekLast() > nums[right]) {
                    Minqueue.removeLast();
                }

                Maxqueue.add(nums[right]);
                Minqueue.add(nums[right]);

                while (!Maxqueue.isEmpty() && !Minqueue.isEmpty() && Maxqueue.peekFirst() - Minqueue.peekFirst() > limit) {
                    if (Minqueue.peekFirst() == nums[left]) {
                        Minqueue.removeFirst();
                    }
                    if (Maxqueue.peekFirst() == nums[left]) {
                        Maxqueue.removeFirst();
                    }
                    left++;
                }
                right++;

                max = Math.max(max,right - left);


            }

            return max;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
