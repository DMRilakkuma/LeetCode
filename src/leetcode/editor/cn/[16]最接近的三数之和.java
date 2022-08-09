/**
 * <p>给你一个长度为 <code>n</code> 的整数数组&nbsp;<code>nums</code><em>&nbsp;</em>和 一个目标值&nbsp;<code>target</code>。请你从 <code>nums</code><em> </em>中选出三个整数，使它们的和与&nbsp;<code>target</code>&nbsp;最接近。</p>
 *
 * <p>返回这三个数的和。</p>
 *
 * <p>假定每组输入只存在恰好一个解。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [-1,2,1,-4], target = 1
 * <strong>输出：</strong>2
 * <strong>解释：</strong>与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [0,0,0], target = 1
 * <strong>输出：</strong>0
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>3 &lt;= nums.length &lt;= 1000</code></li>
 * <li><code>-1000 &lt;= nums[i] &lt;= 1000</code></li>
 * <li><code>-10<sup>4</sup> &lt;= target &lt;= 10<sup>4</sup></code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>双指针</li><li>排序</li></div></div><br><div><li>👍 1138</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 最接近的三数之和
 *
 * @author MC
 * @date 2022-05-10 19:00:56
 */
class P16_ThreeSumClosest {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P16_ThreeSumClosest().new Solution();
        solution.threeSumClosest(new int[]{-3,-2,-5,3,-4}, -1);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int n = nums.length;
            int min = 3000;
            for (int i = 0; i < n - 1; i++) {
                int left = i + 1;
                int right = n - 1;
                while (left < right) {
                    int total = nums[i] + nums[left] + nums[right];
                    if (total == target) {
                        return total;
                    } else if (total > target) {
                        min = Math.abs(total - target) <= Math.abs(min - target) ? total : min;
                        right--;
                    } else {
                        min = Math.abs(total - target) < Math.abs(min - target) ? total : min;
                        left++;
                    }
                }
            }

            return min;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
