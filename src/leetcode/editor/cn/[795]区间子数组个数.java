/**
 * <p>给你一个整数数组 <code>nums</code> 和两个整数：<code>left</code> 及 <code>right</code> 。找出 <code>nums</code> 中连续、非空且其中最大元素在范围&nbsp;<code>[left, right]</code> 内的子数组，并返回满足条件的子数组的个数。</p>
 *
 * <p>生成的测试用例保证结果符合 <strong>32-bit</strong> 整数范围。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [2,1,4,3], left = 2, right = 3
 * <strong>输出：</strong>3
 * <strong>解释：</strong>满足条件的三个子数组：[2], [2, 1], [3]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [2,9,2,5,6], left = 2, right = 8
 * <strong>输出：</strong>7
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 * <li><code>0 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 * <li><code>0 &lt;= left &lt;= right &lt;= 10<sup>9</sup></code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>双指针</li></div></div><br><div><li>👍 177</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 区间子数组个数
 * @author MC
 * @date 2022-04-28 22:21:58
 */
class P795_NumberOfSubarraysWithBoundedMaximum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P795_NumberOfSubarraysWithBoundedMaximum().new Solution();
        int size = solution.numSubarrayBoundedMax(new int[]{2,1,4,3}, 2, 3);
        System.out.println(size);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numSubarrayBoundedMax(int[] nums, int left, int right) {
//            HashSet<int[]> set = new HashSet<>();
//            int l = 0;
//            int r = 0;
//            boolean isFlag = false;
//            int max = 0;
//            while(l < nums.length){
//                max = Math.max(max,nums[r]);
//                if(max >= left && max <= right){
//                    isFlag = true;
//                }else{
//                    isFlag = false;
//                }
//
//                if(isFlag){
//                   set.add(Arrays.copyOfRange(nums,l,r+1));
//                }
//
//                r++;
//
//                if(r == nums.length){
//                    l++;
//                    r = l;
//                    max = 0;
//                }
//
//            }
//
//            return set.size();
            return calculate(nums, right) - calculate(nums, left-1);



        }

        public int calculate(int [] nums , int max){
            int count = 0;
            int ans = 0;
            for (int i = 0; i < nums.length; i++){
                if(nums[i] <= max){
                    count++;
                }else{
                    count = 0;
                }

                ans+=count;
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
