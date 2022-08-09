/**
 * <p>给你一个字符串 <code>s</code>&nbsp;，它只包含三种字符 a, b 和 c 。</p>
 *
 * <p>请你返回 a，b 和 c 都&nbsp;<strong>至少&nbsp;</strong>出现过一次的子字符串数目。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;abcabc&quot;
 * <strong>输出：</strong>10
 * <strong>解释：</strong>包含 a，b 和 c 各至少一次的子字符串为<em> &quot;</em>abc<em>&quot;, &quot;</em>abca<em>&quot;, &quot;</em>abcab<em>&quot;, &quot;</em>abcabc<em>&quot;, &quot;</em>bca<em>&quot;, &quot;</em>bcab<em>&quot;, &quot;</em>bcabc<em>&quot;, &quot;</em>cab<em>&quot;, &quot;</em>cabc<em>&quot; </em>和<em> &quot;</em>abc<em>&quot; </em>(<strong>相同</strong><strong>字符串算多次</strong>)<em>。</em>
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;aaacb&quot;
 * <strong>输出：</strong>3
 * <strong>解释：</strong>包含 a，b 和 c 各至少一次的子字符串为<em> &quot;</em>aaacb<em>&quot;, &quot;</em>aacb<em>&quot; </em>和<em> &quot;</em>acb<em>&quot; 。</em>
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;abc&quot;
 * <strong>输出：</strong>1
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>3 &lt;= s.length &lt;= 5 x 10^4</code></li>
 * <li><code>s</code>&nbsp;只包含字符 a，b 和 c 。</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 71</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 包含所有三种字符的子字符串数目
 *
 * @author MC
 * @date 2022-05-03 20:41:12
 */
class P1358_NumberOfSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1358_NumberOfSubstringsContainingAllThreeCharacters().new Solution();
        int n = solution.numberOfSubstrings("aaacb");
        System.out.println(n);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numberOfSubstrings(String s) {
            int[] nums = new int[3];
            int l = 0;
            int r = 0;
            int count = 0;
            int res = 0;

            while (r < s.length()) {
                if (nums[s.charAt(r) - 'a']++ == 0) {
                    count++;
                }

                while (count == 3) {
                    res += s.length() - r;
                    if (--nums[s.charAt(l) - 'a'] == 0) {
                        count--;
                    }
                    l++;
                }
                r++;

            }

            return res;

        }
    }

}


