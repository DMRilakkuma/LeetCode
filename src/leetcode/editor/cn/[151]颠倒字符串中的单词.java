/**
 * <p>给你一个字符串 <code>s</code> ，颠倒字符串中 <strong>单词</strong> 的顺序。</p>
 *
 * <p><strong>单词</strong> 是由非空格字符组成的字符串。<code>s</code> 中使用至少一个空格将字符串中的 <strong>单词</strong> 分隔开。</p>
 *
 * <p>返回 <strong>单词</strong> 顺序颠倒且 <strong>单词</strong> 之间用单个空格连接的结果字符串。</p>
 *
 * <p><strong>注意：</strong>输入字符串 <code>s</code>中可能会存在前导空格、尾随空格或者单词间的多个空格。返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>s = "<code>the sky is blue</code>"
 * <strong>输出：</strong>"<code>blue is sky the</code>"
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>s = " &nbsp;hello world &nbsp;"
 * <strong>输出：</strong>"world hello"
 * <strong>解释：</strong>颠倒后的字符串中不能存在前导空格和尾随空格。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>s = "a good &nbsp; example"
 * <strong>输出：</strong>"example good a"
 * <strong>解释：</strong>如果两个单词间有多余的空格，颠倒后的字符串需要将单词间的空格减少到仅有一个。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
 * <li><code>s</code> 包含英文大小写字母、数字和空格 <code>' '</code></li>
 * <li><code>s</code> 中 <strong>至少存在一个</strong> 单词</li>
 * </ul>
 *
 * <ul>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>进阶：</strong>如果字符串在你使用的编程语言中是一种可变数据类型，请尝试使用&nbsp;<code>O(1)</code> 额外空间复杂度的 <strong>原地</strong> 解法。</p>
 * <div><div>Related Topics</div><div><li>双指针</li><li>字符串</li></div></div><br><div><li>👍 545</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 颠倒字符串中的单词
 *
 * @author MC
 * @date 2022-05-12 19:16:56
 */
class P151_ReverseWordsInAString {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P151_ReverseWordsInAString().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseWords(String s) {
            int left = 0;
            int right = s.length() - 1;
            while (s.charAt(left) == ' ' || s.charAt(right) == ' ') {
                if (s.charAt(left) == ' ') {
                    left++;
                }
                if (s.charAt(right) == ' ') {
                    right--;
                }
            }
            char[] c = new char[right - left + 1];
            int index = 0;
            for (int i = left; i <= right; i++) {
                if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                    continue;
                }
                c[index++] = s.charAt(i);
            }
            reverse(c, 0, index - 1);
            int l = 0;
            int r = 0;
            while (r < index) {
                if (c[r] == ' ') {
                    reverse(c, l, r - 1);
                    l = r + 1;
                }
                if (r == index - 1) {
                    reverse(c, l, r );
                }
                r++;
            }

            return new String(c,0,index);

        }

        public char[] reverse(char[] c, int start, int end) {
            while (start < end) {
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;
            }

            return c;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
