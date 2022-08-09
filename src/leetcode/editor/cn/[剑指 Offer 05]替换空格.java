/**
 * <p>请实现一个函数，把字符串 <code>s</code> 中的每个空格替换成&quot;%20&quot;。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>s = &quot;We are happy.&quot;
 * <strong>输出：</strong>&quot;We%20are%20happy.&quot;</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>限制：</strong></p>
 *
 * <p><code>0 &lt;= s 的长度 &lt;= 10000</code></p>
 * <div><div>Related Topics</div><div><li>字符串</li></div></div><br><div><li>👍 285</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 替换空格
 *
 * @author MC
 * @date 2022-05-12 18:53:13
 */
class 剑指Offer05替换空格 {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new 剑指Offer05替换空格().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String replaceSpace(String s) {
            char [] c = new char[s.length()*3];
            int index = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ' '){
                    c[index++] = '%';
                    c[index++] = '2';
                    c[index++] = '0';
                }else{
                    c[index++] = s.charAt(i);
                }
            }

            return new String(c,0,index);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
