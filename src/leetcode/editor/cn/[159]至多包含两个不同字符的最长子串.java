/**
 * <p>给定一个字符串<strong><em> s</em></strong> ，找出&nbsp;<strong>至多&nbsp;</strong>包含两个不同字符的最长子串 <strong><em>t</em> </strong>，并返回该子串的长度。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;eceba&quot;
 * <strong>输出: </strong>3
 * <strong>解释: <em>t</em></strong> 是 &quot;ece&quot;，长度为3。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;ccaabbb&quot;
 * <strong>输出: </strong>5
 * <strong>解释: <em>t</em></strong><em> </em>是 &quot;aabbb&quot;，长度为5。
 * </pre>
 * <div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 166</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 至多包含两个不同字符的最长子串
 *
 * @author MC
 * @date 2022-04-27 14:49:07
 */
class P159_LongestSubstringWithAtMostTwoDistinctCharacters {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P159_LongestSubstringWithAtMostTwoDistinctCharacters().new Solution();
        int n = solution.lengthOfLongestSubstringTwoDistinct("aaaa");
        System.out.println(n);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int lengthOfLongestSubstringTwoDistinct(String s) {
            int n = s.length();
            if(n <= 2){
                return n;
            }

            HashMap<Character, Integer> hashmap = new HashMap<>();
            int left = 0;
            int right = 0;
            int max = 2;
            while(right < n){
                if(hashmap.size() < 3){
                    hashmap.put(s.charAt(right),right++);
                }

                if(hashmap.size() == 3){
                    int index = Collections.min(hashmap.values());
                    hashmap.remove(s.charAt(index));
                    left = index + 1;

                }
                max = Math.max(max,right - left);
            }

            return max;

        }
//leetcode submit region end(Prohibit modification and deletion)

    }
}


