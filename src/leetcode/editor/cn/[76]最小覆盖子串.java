/**
 * <p>给你一个字符串 <code>s</code> 、一个字符串 <code>t</code> 。返回 <code>s</code> 中涵盖 <code>t</code> 所有字符的最小子串。如果 <code>s</code> 中不存在涵盖 <code>t</code> 所有字符的子串，则返回空字符串 <code>""</code> 。</p>
 *
 * <p> </p>
 *
 * <p><strong>注意：</strong></p>
 *
 * <ul>
 * <li>对于 <code>t</code> 中重复字符，我们寻找的子字符串中该字符数量必须不少于 <code>t</code> 中该字符数量。</li>
 * <li>如果 <code>s</code> 中存在这样的子串，我们保证它是唯一的答案。</li>
 * </ul>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>s = "ADOBECODEBANC", t = "ABC"
 * <strong>输出：</strong>"BANC"
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>s = "a", t = "a"
 * <strong>输出：</strong>"a"
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> s = "a", t = "aa"
 * <strong>输出:</strong> ""
 * <strong>解释:</strong> t 中两个字符 'a' 均应包含在 s 的子串中，
 * 因此没有符合条件的子字符串，返回空字符串。</pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 <= s.length, t.length <= 10<sup>5</sup></code></li>
 * <li><code>s</code> 和 <code>t</code> 由英文字母组成</li>
 * </ul>
 *
 * <p> </p>
 * <strong>进阶：</strong>你能设计一个在 <code>o(n)</code> 时间内解决此问题的算法吗？<div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 1824</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 最小覆盖子串
 *
 * @author MC
 * @date 2022-04-24 16:57:32
 */
class P76_MinimumWindowSubstring {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P76_MinimumWindowSubstring().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String minWindow(String s, String t) {
            if (t.length() > s.length()) {
                return "";
            }

            int[] need = new int[128];
            int count = t.length();
            for (int i = 0; i < t.length(); i++) {
                need[t.charAt(i)]++;
            }
            int l = 0;
            int r = 0;
            int start = 0;
            int size = Integer.MAX_VALUE;
            while (r < s.length()) {
                if (need[s.charAt(r)] > 0) {
                    count--;
                }
                need[s.charAt(r)]--;

                if (count == 0) {
                    while (l < r && need[s.charAt(l)] < 0) {
                        need[s.charAt(l)]++;
                        l++;
                    }

                    start = r - l + 1 < size ? l : start;
                    size = Math.min(size, r - l + 1);

                    need[s.charAt(l)]++;
                    count++;
                    l++;
                }

                r++;
            }

            return size == Integer.MAX_VALUE ? "" : s.substring(start,start+size);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
