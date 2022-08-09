/**
 * <p>给定一个整数数组 <code>arr</code>&nbsp;，返回 <code>arr</code>&nbsp;的&nbsp;<em>最大湍流子数组的<strong>长度</strong></em><strong>&nbsp;</strong>。</p>
 *
 * <p>如果比较符号在子数组中的每个相邻元素对之间翻转，则该子数组是&nbsp;<strong>湍流子数组</strong>&nbsp;。</p>
 *
 * <p>更正式地来说，当 <code>arr</code>&nbsp;的子数组&nbsp;<code>A[i], A[i+1], ..., A[j]</code>&nbsp;满足仅满足下列条件时，我们称其为<em>湍流子数组</em>：</p>
 *
 * <ul>
 * <li>若&nbsp;<code>i &lt;= k &lt; j</code>&nbsp;：
 *
 * <ul>
 * <li>当 <code>k</code>&nbsp;为奇数时，&nbsp;<code>A[k] &gt; A[k+1]</code>，且</li>
 * <li>当 <code>k</code> 为偶数时，<code>A[k] &lt; A[k+1]</code>；</li>
 * </ul>
 * </li>
 * <li><strong>或 </strong>若&nbsp;<code>i &lt;= k &lt; j</code>&nbsp;：
 * <ul>
 * <li>当 <code>k</code> 为偶数时，<code>A[k] &gt; A[k+1]</code>&nbsp;，且</li>
 * <li>当 <code>k</code>&nbsp;为奇数时，&nbsp;<code>A[k] &lt; A[k+1]</code>。</li>
 * </ul>
 * </li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>arr = [9,4,2,10,7,8,8,1,9]
 * <strong>输出：</strong>5
 * <strong>解释：</strong>arr[1] &gt; arr[2] &lt; arr[3] &gt; arr[4] &lt; arr[5]</pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>arr = [4,8,12,16]
 * <strong>输出：</strong>2
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>arr = [100]
 * <strong>输出：</strong>1
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= arr.length &lt;= 4 * 10<sup>4</sup></code></li>
 * <li><code>0 &lt;= arr[i] &lt;= 10<sup>9</sup></code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>动态规划</li><li>滑动窗口</li></div></div><br><div><li>👍 200</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 最长湍流子数组
 *
 * @author MC
 * @date 2022-05-06 17:57:09
 */
class P978_LongestTurbulentSubarray {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P978_LongestTurbulentSubarray().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxTurbulenceSize(int[] arr) {
            int left = 0;
            int right = 0;
            int max = 1;
            while (right < arr.length - 1) {
                if (left == right) {
                    if (arr[left] == arr[left + 1]) {
                        left++;
                    }
                    right++;
                } else {
                    if (arr[right - 1] < arr[right] && arr[right] > arr[right + 1]) {
                        right++;
                    } else if (arr[right - 1] > arr[right] && arr[right] < arr[right + 1]) {
                        right++;
                    } else {
                        left = right;
                    }
                }
                max = Math.max(max, right - left+1);
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
