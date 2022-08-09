/**
 * <p>给定一个字符串 <code>s</code> 和一个整数 <code>k</code>，从字符串开头算起，每计数至 <code>2k</code> 个字符，就反转这 <code>2k</code> 字符中的前 <code>k</code> 个字符。</p>
 *
 * <ul>
 * <li>如果剩余字符少于 <code>k</code> 个，则将剩余字符全部反转。</li>
 * <li>如果剩余字符小于 <code>2k</code> 但大于或等于 <code>k</code> 个，则反转前 <code>k</code> 个字符，其余字符保持原样。</li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>s = "abcdefg", k = 2
 * <strong>输出：</strong>"bacdfeg"
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>s = "abcd", k = 2
 * <strong>输出：</strong>"bacd"
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
 * <li><code>s</code> 仅由小写英文组成</li>
 * <li><code>1 &lt;= k &lt;= 10<sup>4</sup></code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>双指针</li><li>字符串</li></div></div><br><div><li>👍 291</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 反转字符串 II
 *
 * @author MC
 * @date 2022-05-12 18:33:45
 */
class P541_ReverseStringIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P541_ReverseStringIi().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseStr(String s, int k) {
            char[] chars = s.toCharArray();
            int left = 0;
            int right = k-1;

            while(left < chars.length){
                int l = left;
                int r= right;
                if(right >= chars.length){
                    r = chars.length-1;
                }

                while(l < r){
                    char temp = chars[l];
                    chars[l] = chars[r];
                    chars[r] = temp;
                    l++;
                    r--;
                }
                left+= 2*k;
                right+=2*k;
            }
            return String.valueOf(chars);



        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
