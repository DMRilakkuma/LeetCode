/**
 * <p>字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串&quot;abcdefg&quot;和数字2，该函数将返回左旋转两位得到的结果&quot;cdefgab&quot;。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入:</strong> s = &quot;abcdefg&quot;, k = 2
 * <strong>输出:&nbsp;</strong>&quot;cdefgab&quot;
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入:</strong> s = &quot;lrloseumgh&quot;, k = 6
 * <strong>输出:&nbsp;</strong>&quot;umghlrlose&quot;
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>限制：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= k &lt; s.length &lt;= 10000</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数学</li><li>双指针</li><li>字符串</li></div></div><br><div><li>👍 249</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 左旋转字符串
 *
 * @author MC
 * @date 2022-05-13 15:42:02
 */
class 剑指Offer58II左旋转字符串 {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new 剑指Offer58II左旋转字符串().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseLeftWords(String s, int n) {
            char[] chars= new char[s.length()];
            int index = 0;
            for (int i = n; i < s.length(); i++) {
                chars[index++] = s.charAt(i);
            }
            for (int i = 0; i < n; i++) {
                chars[index++] = s.charAt(i);
            }
            return new String(chars);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
