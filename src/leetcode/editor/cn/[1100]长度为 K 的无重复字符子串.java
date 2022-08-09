/**
 * <p>给你一个字符串&nbsp;<code>S</code>，找出所有长度为&nbsp;<code>K</code>&nbsp;且不含重复字符的子串，请你返回全部满足要求的子串的&nbsp;<strong>数目</strong>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>S = &quot;havefunonleetcode&quot;, K = 5
 * <strong>输出：</strong>6
 * <strong>解释：</strong>
 * 这里有 6 个满足题意的子串，分别是：&#39;havef&#39;,&#39;avefu&#39;,&#39;vefun&#39;,&#39;efuno&#39;,&#39;etcod&#39;,&#39;tcode&#39;。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>S = &quot;home&quot;, K = 5
 * <strong>输出：</strong>0
 * <strong>解释：</strong>
 * 注意：K 可能会大于 S 的长度。在这种情况下，就无法找到任何长度为 K 的子串。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * <li><code>1 &lt;= S.length &lt;= 10^4</code></li>
 * <li><code>S</code> 中的所有字符均为小写英文字母</li>
 * <li><code>1 &lt;= K &lt;= 10^4</code></li>
 * </ol>
 * <div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 37</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.*;

/**
 * 长度为 K 的无重复字符子串
 *
 * @author MC
 * @date 2022-05-07 17:54:55
 */
class P1100_FindKLengthSubstringsWithNoRepeatedCharacters {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1100_FindKLengthSubstringsWithNoRepeatedCharacters().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numKLenSubstrNoRepeats(String s, int k) {
            int n = s.length();
            if (n < k) {
                return 0;
            }
            int left = 0;
            int right = 0;
            int res = 0;
            Set<Character> set = new HashSet<>();
            while (right < n) {
                while (set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));

                if(right - left+1 == k ){
                    res++;
                    set.remove(s.charAt(left));
                    left++;
                }
                right++;

            }

            return res;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
