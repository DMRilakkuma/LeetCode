/**
 * <p>给定两个字符串 <code><em>s</em></code> 和 <code><em>t</em></code> ，编写一个函数来判断 <code><em>t</em></code> 是否是 <code><em>s</em></code> 的字母异位词。</p>
 *
 * <p><strong>注意：</strong>若 <code><em>s</em></code> 和 <code><em>t</em></code><em> </em>中每个字符出现的次数都相同，则称 <code><em>s</em></code> 和 <code><em>t</em></code><em> </em>互为字母异位词。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> <em>s</em> = "anagram", <em>t</em> = "nagaram"
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> <em>s</em> = "rat", <em>t</em> = "car"
 * <strong>输出: </strong>false</pre>
 *
 * <p> </p>
 *
 * <p><strong>提示:</strong></p>
 *
 * <ul>
 * <li><code>1 <= s.length, t.length <= 5 * 10<sup>4</sup></code></li>
 * <li><code>s</code> 和 <code>t</code> 仅包含小写字母</li>
 * </ul>
 *
 * <p> </p>
 *
 * <p><strong>进阶: </strong>如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？</p>
 * <div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>排序</li></div></div><br><div><li>👍 576</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 有效的字母异位词
 *
 * @author MC
 * @date 2022-05-12 14:27:41
 */
class P242_ValidAnagram {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P242_ValidAnagram().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isAnagram(String s, String t) {
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                if (map1.get(s.charAt(i)) == null) {
                    map1.put(s.charAt(i), 1);
                } else {
                    map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
                }

            }
            for (int i = 0; i < t.length(); i++) {
                if (map2.get(t.charAt(i)) == null) {
                    map2.put(t.charAt(i), 1);
                } else {
                    map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
                }

            }

            if(map1.equals(map2)){
                return true;
            }else{
                return false;
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
