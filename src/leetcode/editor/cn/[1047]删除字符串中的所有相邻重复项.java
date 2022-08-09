/**
 * <p>给出由小写字母组成的字符串&nbsp;<code>S</code>，<strong>重复项删除操作</strong>会选择两个相邻且相同的字母，并删除它们。</p>
 *
 * <p>在 S 上反复执行重复项删除操作，直到无法继续删除。</p>
 *
 * <p>在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;abbaca&quot;
 * <strong>输出：</strong>&quot;ca&quot;
 * <strong>解释：</strong>
 * 例如，在 &quot;abbaca&quot; 中，我们可以删除 &quot;bb&quot; 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 &quot;aaca&quot;，其中又只有 &quot;aa&quot; 可以执行重复项删除操作，所以最后的字符串为 &quot;ca&quot;。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * <li><code>1 &lt;= S.length &lt;= 20000</code></li>
 * <li><code>S</code> 仅由小写英文字母组成。</li>
 * </ol>
 * <div><div>Related Topics</div><div><li>栈</li><li>字符串</li></div></div><br><div><li>👍 376</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 删除字符串中的所有相邻重复项
 *
 * @author MC
 * @date 2022-05-14 15:50:17
 */
class P1047_RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1047_RemoveAllAdjacentDuplicatesInString().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String removeDuplicates(String s) {
            Deque<Character> queue = new LinkedList<>();
            for (int i = 0; i < s.length(); i++) {
                if(!queue.isEmpty() && queue.peek() == s.charAt(i)){
                    queue.pop();
                }else{
                    queue.push(s.charAt(i));
                }
            }
            StringBuilder s2 = new StringBuilder();
            while(!queue.isEmpty()){
                s2.append(queue.pollLast());
            }

            return s2.toString();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
