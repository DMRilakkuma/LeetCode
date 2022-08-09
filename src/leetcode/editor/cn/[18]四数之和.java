/**
 * <p>给你一个由 <code>n</code> 个整数组成的数组&nbsp;<code>nums</code> ，和一个目标值 <code>target</code> 。请你找出并返回满足下述全部条件且<strong>不重复</strong>的四元组&nbsp;<code>[nums[a], nums[b], nums[c], nums[d]]</code>&nbsp;（若两个四元组元素一一对应，则认为两个四元组重复）：</p>
 *
 * <ul>
 * <li><code>0 &lt;= a, b, c, d&nbsp;&lt; n</code></li>
 * <li><code>a</code>、<code>b</code>、<code>c</code> 和 <code>d</code> <strong>互不相同</strong></li>
 * <li><code>nums[a] + nums[b] + nums[c] + nums[d] == target</code></li>
 * </ul>
 *
 * <p>你可以按 <strong>任意顺序</strong> 返回答案 。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [1,0,-1,0,-2,2], target = 0
 * <strong>输出：</strong>[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [2,2,2,2,2], target = 8
 * <strong>输出：</strong>[[2,2,2,2]]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 200</code></li>
 * <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 * <li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>双指针</li><li>排序</li></div></div><br><div><li>👍 1236</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.*;

/**
 * 四数之和
 *
 * @author MC
 * @date 2022-05-10 20:54:37
 */
class P18_FourSum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P18_FourSum().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            int n = nums.length;
            Set<List<Integer>> set = new HashSet<>();
            Loop1:
            for (int i = 0; i < n - 2; i++) {
                Loop2:
                for (int j = i + 1; j < n - 1; j++) {
                    if (nums[i] + nums[j] >= target) {
                        break Loop1;
                    }
                    int left = j + 1;
                    int right = n - 1;
                    while (left < right) {
                        if (nums[i] + nums[j] + nums[left] + nums[right] == target) {
                            set.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[left], nums[right])));
                            left++;
                            right--;
                        } else if (nums[i] + nums[j] + nums[left] + nums[right] > target) {
                            right--;
                        } else {
                            left++;
                        }
                    }

                }
            }
            ArrayList<List<Integer>> list = new ArrayList<>(set);
            return list;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
