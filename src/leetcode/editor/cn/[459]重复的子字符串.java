/**
 * <p>给定一个非空的字符串<meta charset="UTF-8" />&nbsp;<code>s</code>&nbsp;，检查是否可以通过由它的一个子串重复多次构成。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> s = "abab"
 * <strong>输出:</strong> true
 * <strong>解释:</strong> 可由子串 "ab" 重复两次构成。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> s = "aba"
 * <strong>输出:</strong> false
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> s = "abcabcabcabc"
 * <strong>输出:</strong> true
 * <strong>解释:</strong> 可由子串 "abc" 重复四次构成。 (或子串 "abcabc" 重复两次构成。)
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><b>提示：</b></p>
 *
 * <p><meta charset="UTF-8" /></p>
 *
 * <ul>
 * <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
 * <li><code>s</code>&nbsp;由小写英文字母组成</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>字符串</li><li>字符串匹配</li></div></div><br><div><li>👍 693</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 重复的子字符串
 *
 * @author MC
 * @date 2022-05-13 16:08:11
 */
class P459_RepeatedSubstringPattern {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P459_RepeatedSubstringPattern().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            int n = s.length();
            if (n == 1) {
                return false;
            }
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    boolean isFlag = true;
                    for (int j = i; j < n; j++) {
                        if (s.charAt(j) != s.charAt(j - i)) {
                            isFlag = false;
                            break;
                        }
                    }
                    if (isFlag){
                        return true;
                    }
                }

            }

            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
