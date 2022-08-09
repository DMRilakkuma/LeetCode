/**
 * <p>给定两个字符串&nbsp;<code>s</code>&nbsp;和 <code>p</code>，找到&nbsp;<code>s</code><strong>&nbsp;</strong>中所有&nbsp;<code>p</code><strong>&nbsp;</strong>的&nbsp;<strong>异位词&nbsp;</strong>的子串，返回这些子串的起始索引。不考虑答案输出的顺序。</p>
 *
 * <p><strong>异位词 </strong>指由相同字母重排列形成的字符串（包括相同的字符串）。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre>
 * <strong>输入: </strong>s = "cbaebabacd", p = "abc"
 * <strong>输出: </strong>[0,6]
 * <strong>解释:</strong>
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
 * </pre>
 *
 * <p><strong>&nbsp;示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入: </strong>s = "abab", p = "ab"
 * <strong>输出: </strong>[0,1,2]
 * <strong>解释:</strong>
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= s.length, p.length &lt;= 3 * 10<sup>4</sup></code></li>
 * <li><code>s</code>&nbsp;和&nbsp;<code>p</code>&nbsp;仅包含小写字母</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 873</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 找到字符串中所有字母异位词
 *
 * @author MC
 * @date 2022-05-06 12:42:02
 */
class P438_FindAllAnagramsInAString {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P438_FindAllAnagramsInAString().new Solution();
        List<Integer> list = solution.findAnagrams("baa", "aa");
        System.out.println(list);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            int n = s.length();

            int[] nums = new int[26];
            int[] nums2 = new int[26];
            List<Integer> list = new ArrayList<Integer>();
            if (s.length() < p.length()) {
                return list;
            }
            int left = 0;
            int right = 0;
            for (int i = 0; i < p.length(); i++) {
                nums[p.charAt(i) - 'a']++;
            }
            for (right = 0; right < p.length(); right++) {
                nums2[s.charAt(right) - 'a']++;
            }
            if (Arrays.equals(nums, nums2)) {
                list.add(left);
            }
            nums2[s.charAt(left) - 'a']--;
            left++;
            while (right < s.length()) {
                nums2[s.charAt(right) - 'a']++;
                if (Arrays.equals(nums, nums2)) {
                    list.add(left);
                }
                nums2[s.charAt(left) - 'a']--;
                left++;
                right++;

            }

            return list;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
