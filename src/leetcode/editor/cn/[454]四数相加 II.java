/**
 * <p>给你四个整数数组 <code>nums1</code>、<code>nums2</code>、<code>nums3</code> 和 <code>nums4</code> ，数组长度都是 <code>n</code> ，请你计算有多少个元组 <code>(i, j, k, l)</code> 能满足：</p>
 *
 * <ul>
 * <li><code>0 &lt;= i, j, k, l &lt; n</code></li>
 * <li><code>nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0</code></li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
 * <strong>输出：</strong>2
 * <strong>解释：</strong>
 * 两个元组如下：
 * 1. (0, 0, 0, 1) -&gt; nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
 * 2. (1, 1, 0, 0) -&gt; nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]
 * <strong>输出：</strong>1
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p>&nbsp; <strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>n == nums1.length</code></li>
 * <li><code>n == nums2.length</code></li>
 * <li><code>n == nums3.length</code></li>
 * <li><code>n == nums4.length</code></li>
 * <li><code>1 &lt;= n &lt;= 200</code></li>
 * <li><code>-2<sup>28</sup> &lt;= nums1[i], nums2[i], nums3[i], nums4[i] &lt;= 2<sup>28</sup></code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>哈希表</li></div></div><br><div><li>👍 570</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 四数相加 II
 *
 * @author MC
 * @date 2022-05-12 17:13:00
 */
class P454_FourSumIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P454_FourSumIi().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int ans = 0;
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    int total1 = nums1[i] + nums1[j];
                    map.put(total1, map.getOrDefault(total1, 0) + 1);
                }
            }
            for (int i = 0; i < nums3.length; i++) {
                for (int j = 0; j < nums4.length; j++) {
                    int total2 = nums3[i] + nums4[j];
                    if (map.containsKey(-total2)) {
                        ans += map.get(-total2);
                    }
                }
            }
            return ans;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
