/**
 * <p>给定字符串 <code>S</code> and <code>T</code>，找出 <code>S</code> 中最短的（连续）<strong>子串</strong> <code>W</code> ，使得 <code>T</code> 是 <code>W</code> 的 <strong>子序列</strong> 。</p>
 *
 * <p>如果 <code>S</code> 中没有窗口可以包含 <code>T</code> 中的所有字符，返回空字符串 <code>&quot;&quot;</code>。如果有不止一个最短长度的窗口，返回开始位置最靠左的那个。</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>
 * S = &quot;abcdebdde&quot;, T = &quot;bde&quot;
 * <strong>输出：</strong>&quot;bcde&quot;
 * <strong>解释：</strong>
 * &quot;bcde&quot; 是答案，因为它在相同长度的字符串 &quot;bdde&quot; 出现之前。
 * &quot;deb&quot; 不是一个更短的答案，因为在窗口中必须按顺序出现 T 中的元素。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>注：</strong></p>
 *
 * <ul>
 * <li>所有输入的字符串都只包含小写字母。All the strings in the input will only contain lowercase letters.</li>
 * <li><code>S</code>&nbsp;长度的范围为&nbsp;<code>[1, 20000]</code>。</li>
 * <li><code>T</code>&nbsp;长度的范围为&nbsp;<code>[1, 100]</code>。</li>
 * </ul>
 *
 * <p>&nbsp;</p>
 * <div><div>Related Topics</div><div><li>字符串</li><li>动态规划</li><li>滑动窗口</li></div></div><br><div><li>👍 116</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 最小窗口子序列
 * @author MC
 * @date 2022-05-07 17:52:06
 */
class P727_MinimumWindowSubsequence {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P727_MinimumWindowSubsequence().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String minWindow(String s1, String s2) {
            return "";


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
