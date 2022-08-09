/**
 * <p>实现&nbsp;<a href="https://baike.baidu.com/item/strstr/811469" target="_blank">strStr()</a>&nbsp;函数。</p>
 *
 * <p>给你两个字符串&nbsp;<code>haystack</code> 和 <code>needle</code> ，请你在 <code>haystack</code> 字符串中找出 <code>needle</code> 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回&nbsp; <code>-1</code><strong> </strong>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>说明：</strong></p>
 *
 * <p>当&nbsp;<code>needle</code>&nbsp;是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。</p>
 *
 * <p>对于本题而言，当&nbsp;<code>needle</code>&nbsp;是空字符串时我们应当返回 0 。这与 C 语言的&nbsp;<a href="https://baike.baidu.com/item/strstr/811469" target="_blank">strstr()</a>&nbsp;以及 Java 的&nbsp;<a href="https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#indexOf(java.lang.String)" target="_blank">indexOf()</a>&nbsp;定义相符。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>haystack = "hello", needle = "ll"
 * <strong>输出：</strong>2
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>haystack = "aaaaa", needle = "bba"
 * <strong>输出：</strong>-1
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>haystack = "", needle = ""
 * <strong>输出：</strong>0
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= haystack.length, needle.length &lt;= 10<sup>4</sup></code></li>
 * <li><code>haystack</code> 和 <code>needle</code> 仅由小写英文字符组成</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>双指针</li><li>字符串</li><li>字符串匹配</li></div></div><br><div><li>👍 1421</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 实现 strStr()
 *
 * @author MC
 * @date 2022-05-13 15:50:13
 */
class P28_ImplementStrstr {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P28_ImplementStrstr().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int strStr(String haystack, String needle) {
            if (haystack.equals("") && needle.equals("")) {
                return 0;
            }
            if (!haystack.contains(needle)) {
                return -1;
            }
            int size = needle.length();
            int l = 0;
            while (l <= haystack.length()-size) {
                if(haystack.charAt(l) == needle.charAt(0) && haystack.substring(l,l+size).equals(needle)){
                    return l ;
                }else{
                    l++;
                }
            }
            return -1;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
