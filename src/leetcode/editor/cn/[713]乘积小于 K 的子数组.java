/**
 * 给你一个整数数组 <code>nums</code> 和一个整数 <code>k</code> ，请你返回子数组内所有元素的乘积严格小于<em> </em><code>k</code> 的连续子数组的数目。
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [10,5,2,6], k = 100
 * <strong>输出：</strong>8
 * <strong>解释：</strong>8 个乘积小于 100 的子数组分别为：[10]、[5]、[2],、[6]、[10,5]、[5,2]、[2,6]、[5,2,6]。
 * 需要注意的是 [10,5,2] 并不是乘积小于 100 的子数组。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [1,2,3], k = 0
 * <strong>输出：</strong>0</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示:&nbsp;</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 3 * 10<sup>4</sup></code></li>
 * <li><code>1 &lt;= nums[i] &lt;= 1000</code></li>
 * <li><code>0 &lt;= k &lt;= 10<sup>6</sup></code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>滑动窗口</li></div></div><br><div><li>👍 400</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 乘积小于 K 的子数组
 *
 * @author MC
 * @date 2022-05-03 20:04:45
 */
class P713_SubarrayProductLessThanK {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P713_SubarrayProductLessThanK().new Solution();
        int n = solution.numSubarrayProductLessThanK(new int[]{1, 1, 1}, 1);
        System.out.println(n);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            int n = nums.length;
            int l = 0;
            int r = 0;
            int product = 1;
            int res = 0;

            if (k == 0 || k == 1) {
                return 0;
            }

            while (r < n) {
                if (product < k) {
                    product *= nums[r];
                }
                r++;
                while (product >= k) {
                    product /= nums[l];
                    l++;
                }


                res += r - l;
            }

            return res;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
