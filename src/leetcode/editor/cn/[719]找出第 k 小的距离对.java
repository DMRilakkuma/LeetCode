/**
 * <p>给定一个整数数组，返回所有数对之间的第 k 个最小<strong>距离</strong>。一对 (A, B) 的距离被定义为 A 和 B 之间的绝对差值。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>
 * nums = [1,3,1]
 * k = 1
 * <strong>输出：0</strong>
 * <strong>解释：</strong>
 * 所有数对如下：
 * (1,3) -&gt; 2
 * (1,1) -&gt; 0
 * (3,1) -&gt; 2
 * 因此第 1 个最小距离的数对是 (1,1)，它们之间的距离为 0。
 * </pre>
 *
 * <p><strong>提示:</strong></p>
 *
 * <ol>
 * <li><code>2 &lt;= len(nums) &lt;= 10000</code>.</li>
 * <li><code>0 &lt;= nums[i] &lt; 1000000</code>.</li>
 * <li><code>1 &lt;= k &lt;= len(nums) * (len(nums) - 1) / 2</code>.</li>
 * </ol>
 * <div><div>Related Topics</div><div><li>数组</li><li>双指针</li><li>二分查找</li><li>排序</li></div></div><br><div><li>👍 240</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 找出第 k 小的距离对
 *
 * @author MC
 * @date 2022-05-05 19:11:30
 */
class P719_FindKThSmallestPairDistance {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P719_FindKThSmallestPairDistance().new Solution();
        int reslut = solution.smallestDistancePair(new int[]{1, 3, 1}, 1);
        System.out.println(reslut);


    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int smallestDistancePair(int[] nums, int k) {
           Arrays.sort(nums);
           int low = 0;
           int high = nums[nums.length-1] - nums[0];
           while(low < high){
               int count = 0;
               int left = 0;
               int mid = low + (high - low)/2;
               for (int right = 1; right < nums.length; right++) {
                   while(nums[right] - nums[left] > mid){
                       left++;
                   }
                   count+=right- left;
               }

               if(count >= k){
                   high = mid;
               }else{
                   low = mid+1;
               }
           }

           return low;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
