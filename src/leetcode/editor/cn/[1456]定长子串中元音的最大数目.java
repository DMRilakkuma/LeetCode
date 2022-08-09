/**
 * <p>给你字符串 <code>s</code> 和整数 <code>k</code> 。</p>
 *
 * <p>请返回字符串 <code>s</code> 中长度为 <code>k</code> 的单个子字符串中可能包含的最大元音字母数。</p>
 *
 * <p>英文中的 <strong>元音字母 </strong>为（<code>a</code>, <code>e</code>, <code>i</code>, <code>o</code>, <code>u</code>）。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;abciiidef&quot;, k = 3
 * <strong>输出：</strong>3
 * <strong>解释：</strong>子字符串 &quot;iii&quot; 包含 3 个元音字母。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;aeiou&quot;, k = 2
 * <strong>输出：</strong>2
 * <strong>解释：</strong>任意长度为 2 的子字符串都包含 2 个元音字母。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;leetcode&quot;, k = 3
 * <strong>输出：</strong>2
 * <strong>解释：</strong>&quot;lee&quot;、&quot;eet&quot; 和 &quot;ode&quot; 都包含 2 个元音字母。
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;rhythms&quot;, k = 4
 * <strong>输出：</strong>0
 * <strong>解释：</strong>字符串 s 中不含任何元音字母。
 * </pre>
 *
 * <p><strong>示例 5：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;tryhard&quot;, k = 4
 * <strong>输出：</strong>1
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= s.length &lt;= 10^5</code></li>
 * <li><code>s</code> 由小写英文字母组成</li>
 * <li><code>1 &lt;= k &lt;= s.length</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 42</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 定长子串中元音的最大数目
 *
 * @author MC
 * @date 2022-04-23 18:25:49
 */
class P1456_MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1456_MaximumNumberOfVowelsInASubstringOfGivenLength().new Solution();
        String s = "leetcode";
        int k = 3;
        int maxVowels = solution.maxVowels(s, k);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxVowels(String s, int k) {
            String str = "aeiou";
            int l = 0;
            int r = l + k - 1;
            int count = 0;
            int max = 0;

            for (int i = l; i<= r; i++) {
                if (str.indexOf(s.charAt(i)) != -1) {
                    count++;
                }

            }
            max = count;
            l++;
            r++;
            while (r < s.length()) {
                if (str.indexOf(s.charAt(l - 1)) != -1) {
                    count--;
                }

                if (str.indexOf(s.charAt(r)) != -1) {
                    count++;
                }

                max = Math.max(max, count);

                l++;
                r++;
            }


            return max;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
