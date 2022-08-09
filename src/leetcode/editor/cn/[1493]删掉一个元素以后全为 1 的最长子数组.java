/**
 * <p>给你一个二进制数组&nbsp;<code>nums</code>&nbsp;，你需要从中删掉一个元素。</p>
 *
 * <p>请你在删掉元素的结果数组中，返回最长的且只包含 1 的非空子数组的长度。</p>
 *
 * <p>如果不存在这样的子数组，请返回 0 。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [1,1,0,1]
 * <strong>输出：</strong>3
 * <strong>解释：</strong>删掉位置 2 的数后，[1,1,1] 包含 3 个 1 。</pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [0,1,1,1,0,1,1,0,1]
 * <strong>输出：</strong>5
 * <strong>解释：</strong>删掉位置 4 的数字后，[0,1,1,1,1,1,0,1] 的最长全 1 子数组为 [1,1,1,1,1] 。</pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [1,1,1]
 * <strong>输出：</strong>2
 * <strong>解释：</strong>你必须要删除一个元素。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 * <li><code>nums[i]</code>&nbsp;要么是&nbsp;<code>0</code>&nbsp;要么是&nbsp;<code>1</code> 。</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数学</li><li>动态规划</li><li>滑动窗口</li></div></div><br><div><li>👍 57</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 删掉一个元素以后全为 1 的最长子数组
 *
 * @author MC
 * @date 2022-05-06 17:16:41
 */
class P1493_LongestSubarrayOf1sAfterDeletingOneElement {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1493_LongestSubarrayOf1sAfterDeletingOneElement().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestSubarray(int[] nums) {
            int n = nums.length;
            int left = 0;
            int right = 0;
            int count = 1;
            int max = 0;
            while (right < n) {
                if (nums[right] == 0 && count == 0) {
                    while(count == 0){
                        if (nums[left] == 0) {
                            count++;
                        }
                        left++;
                    }
                }
                if (nums[right] == 0 && count == 1) {
                    count--;
                }

                right++;
                max = Math.max(max,right - left);


            }

            return max-1;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
