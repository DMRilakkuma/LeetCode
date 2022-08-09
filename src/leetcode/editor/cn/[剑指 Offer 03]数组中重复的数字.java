/**
 * <p>找出数组中重复的数字。</p>
 *
 * <p><br>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>
 * [2, 3, 1, 0, 2, 5, 3]
 * <strong>输出：</strong>2 或 3
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>限制：</strong></p>
 *
 * <p><code>2 &lt;= n &lt;= 100000</code></p>
 * <div><div>Related Topics</div><div><li>数组</li><li>哈希表</li><li>排序</li></div></div><br><div><li>👍 834</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * 数组中重复的数字
 *
 * @author MC
 * @date 2022-05-10 16:01:37
 */
class 剑指Offer03 {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new 剑指Offer03().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findRepeatNumber(int[] nums) {
            Set<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (!set.add(nums[i])){
                    return nums[i];
                }
            }
            return 0;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
