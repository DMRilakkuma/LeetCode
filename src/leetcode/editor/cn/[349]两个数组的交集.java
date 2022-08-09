/**
 * <p>给定两个数组&nbsp;<code>nums1</code>&nbsp;和&nbsp;<code>nums2</code> ，返回 <em>它们的交集</em>&nbsp;。输出结果中的每个元素一定是 <strong>唯一</strong> 的。我们可以 <strong>不考虑输出结果的顺序</strong> 。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums1 = [1,2,2,1], nums2 = [2,2]
 * <strong>输出：</strong>[2]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * <strong>输出：</strong>[9,4]
 * <strong>解释：</strong>[4,9] 也是可通过的
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums1.length, nums2.length &lt;= 1000</code></li>
 * <li><code>0 &lt;= nums1[i], nums2[i] &lt;= 1000</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>哈希表</li><li>双指针</li><li>二分查找</li><li>排序</li></div></div><br><div><li>👍 540</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 两个数组的交集
 *
 * @author MC
 * @date 2022-05-12 15:12:20
 */
class P349_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P349_IntersectionOfTwoArrays().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set <Integer> set = new HashSet<>();
            Set <Integer> set2 = new HashSet<>();
            for (int i = 0; i < nums1.length; i++) {
                set.add(nums1[i]);
            }
            for (int i = 0; i < nums2.length; i++) {
                if(set.contains(nums2[i])){
                    set2.add(nums2[i]);
                }
            }
            int [] arr = new int [ set2.size()];
            int count = 0;
            for (int s : set2) {
                arr[count++] = s;
            }

            return arr;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
