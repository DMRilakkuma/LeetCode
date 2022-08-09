/**
 * <p>给定一个字符串<strong><em> <code>s</code></em></strong> ，找出 <strong>至多 </strong>包含<em> <code>k</code></em> 个不同字符的最长子串 <strong><em>T</em></strong>。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入: </strong>s = "eceba", k = 2
 * <strong>输出: </strong>3
 * <strong>解释: </strong>则<strong> </strong>T 为 "ece"，所以长度为 3。</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入: </strong>s = "aa", k = 1
 * <strong>输出: </strong>2
 * <strong>解释: </strong>则 T 为 "aa"，所以长度为 2。
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 <= s.length <= 5 * 10<sup>4</sup></code></li>
 * <li><code>0 <= k <= 50</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 191</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.Collections;
import java.util.HashMap;

/**
 * 至多包含 K 个不同字符的最长子串
 * @author MC
 * @date 2022-04-28 22:10:49
 */
class P340_LongestSubstringWithAtMostKDistinctCharacters {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P340_LongestSubstringWithAtMostKDistinctCharacters().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstringKDistinct(String s, int k) {
            int n = s.length();
            if(n <= k){
                return n;
            }
            int left = 0;
            int right = 0;
            int max = k;
            HashMap<Character, Integer> hashMap = new HashMap<>();
            while(right < n){
                if(hashMap.size() <= k){
                    hashMap.put(s.charAt(right),right++);
                }
                if(hashMap.size() == k+1){
                    int index = Collections.min(hashMap.values());
                    hashMap.remove(s.charAt(index));
                    left = index+1;
                }
                max = Math.max(max, right - left);
            }
		return max;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
