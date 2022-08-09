/**
 * <p>给你一个字符串 <code>s</code> 和一个整数 <code>k</code> 。你可以选择字符串中的任一字符，并将其更改为任何其他大写英文字符。该操作最多可执行 <code>k</code> 次。</p>
 *
 * <p>在执行上述操作后，返回包含相同字母的最长子字符串的长度。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>s = "ABAB", k = 2
 * <strong>输出：</strong>4
 * <strong>解释：</strong>用两个'A'替换为两个'B',反之亦然。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>s = "AABABBA", k = 1
 * <strong>输出：</strong>4
 * <strong>解释：</strong>
 * 将中间的一个'A'替换为'B',字符串变为 "AABBBBA"。
 * 子串 "BBBB" 有最长重复字母, 答案为 4。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
 * <li><code>s</code> 仅由大写英文字母组成</li>
 * <li><code>0 &lt;= k &lt;= s.length</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 588</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 替换后的最长重复字符
 *
 * @author MC
 * @date 2022-04-24 20:59:57
 */
class P424_LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P424_LongestRepeatingCharacterReplacement().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int characterReplacement(String s, int k) {

            if (s.length() < 2) {
                return 2;
            }
            int[] count = new int[26];
            int l = 0;
            int r = 0;
            int maxcount = 0;
            int ans = 0;
            while (r < s.length()) {
                count[s.charAt(r) - 'A']++;
                maxcount = Math.max(maxcount, count[s.charAt(r) - 'A']);

                if (r - l + 1 > maxcount + k) {
                    count[s.charAt(l) - 'A']--;
                    l++;
                }

                r++;
            }
            return r - l;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
