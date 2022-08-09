/**
 * <p>给你一个整数数组 <code>nums</code> 和两个整数 <code>k</code> 和 <code>t</code> 。请你判断是否存在 <b>两个不同下标</b> <code>i</code> 和 <code>j</code>，使得 <code>abs(nums[i] - nums[j]) <= t</code> ，同时又满足 <code>abs(i - j) <= k</code><em> </em>。</p>
 *
 * <p>如果存在则返回 <code>true</code>，不存在返回 <code>false</code>。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [1,2,3,1], k<em> </em>= 3, t = 0
 * <strong>输出：</strong>true</pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [1,0,1,1], k<em> </em>=<em> </em>1, t = 2
 * <strong>输出：</strong>true</pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [1,5,9,1,5,9], k = 2, t = 3
 * <strong>输出：</strong>false</pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>0 <= nums.length <= 2 * 10<sup>4</sup></code></li>
 * <li><code>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</code></li>
 * <li><code>0 <= k <= 10<sup>4</sup></code></li>
 * <li><code>0 <= t <= 2<sup>31</sup> - 1</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>桶排序</li><li>有序集合</li><li>排序</li><li>滑动窗口</li></div></div><br><div><li>👍 600</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.TreeSet;

/**
 * 存在重复元素 III
 *
 * @author MC
 * @date 2022-05-08 20:29:21
 */
class P220_ContainsDuplicateIii {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P220_ContainsDuplicateIii().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
            int n = nums.length;
            int left = 0;
            int right = 0;
            TreeSet<Long> set = new TreeSet<>();
            while(right < n){
                long u = nums[right];

                Long f = set.floor(u);
                Long c = set.ceiling(u);
                if(f != null && u - f <= t){
                    return true;
                }

                if(c != null && c - u <= t){
                    return true;
                }
                set.add(u);

                if(right >= k){
                    set.remove((long)nums[right - left]);
                    left++;
                }
                right++;
            }


            return false;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
