/**
 * <p>给你两个长度相同的字符串，<code>s</code> 和 <code>t</code>。</p>
 *
 * <p>将 <code>s</code> 中的第 <code>i</code> 个字符变到 <code>t</code> 中的第 <code>i</code> 个字符需要 <code>|s[i] - t[i]|</code> 的开销（开销可能为 0），也就是两个字符的 ASCII 码值的差的绝对值。</p>
 *
 * <p>用于变更字符串的最大预算是 <code>maxCost</code>。在转化字符串时，总开销应当小于等于该预算，这也意味着字符串的转化可能是不完全的。</p>
 *
 * <p>如果你可以将 <code>s</code> 的子字符串转化为它在 <code>t</code> 中对应的子字符串，则返回可以转化的最大长度。</p>
 *
 * <p>如果 <code>s</code> 中没有子字符串可以转化成 <code>t</code> 中对应的子字符串，则返回 <code>0</code>。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>s = "abcd", t = "bcdf", maxCost = 3
 * <strong>输出：</strong>3
 * <strong>解释：</strong>s<strong> </strong>中的<strong> </strong>"abc" 可以变为 "bcd"。开销为 3，所以最大长度为 3。</pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>s = "abcd", t = "cdef", maxCost = 3
 * <strong>输出：</strong>1
 * <strong>解释：</strong>s 中的任一字符要想变成 t 中对应的字符，其开销都是 2。因此，最大长度为<code> 1。</code>
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>s = "abcd", t = "acde", maxCost = 0
 * <strong>输出：</strong>1
 * <strong>解释：</strong>a -> a, cost = 0，字符串未发生变化，所以最大长度为 1。
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 <= s.length, t.length <= 10^5</code></li>
 * <li><code>0 <= maxCost <= 10^6</code></li>
 * <li><code>s</code> 和 <code>t</code> 都只含小写英文字母。</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>字符串</li><li>二分查找</li><li>前缀和</li><li>滑动窗口</li></div></div><br><div><li>👍 164</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 尽可能使字符串相等
 *
 * @author MC
 * @date 2022-05-06 15:05:43
 */
class P1208_GetEqualSubstringsWithinBudget {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1208_GetEqualSubstringsWithinBudget().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int equalSubstring(String s, String t, int maxCost) {
            int n = s.length();
            int left = 0;
            int right = 0;
            int count = 0;
            int max = 0;
            while (right < n) {
                count += Math.abs(s.charAt(right) - t.charAt(right));

                while (count > maxCost ){
                    count -= Math.abs(s.charAt(left) - t.charAt(left));
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
