/**
 * <p>给你一个整数数组 <code>nums</code> 和一个整数 <code>x</code> 。每一次操作时，你应当移除数组 <code>nums</code> 最左边或最右边的元素，然后从 <code>x</code> 中减去该元素的值。请注意，需要 <strong>修改</strong> 数组以供接下来的操作使用。</p>
 *
 * <p>如果可以将 <code>x</code> <strong>恰好</strong> 减到 <code>0</code> ，返回<strong> 最小操作数 </strong>；否则，返回 <code>-1</code> 。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [1,1,4,2,3], x = 5
 * <strong>输出：</strong>2
 * <strong>解释：</strong>最佳解决方案是移除后两个元素，将 x 减到 0 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [5,6,7,8,9], x = 4
 * <strong>输出：</strong>-1
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [3,2,20,1,1,3], x = 10
 * <strong>输出：</strong>5
 * <strong>解释：</strong>最佳解决方案是移除后三个元素和前两个元素（总共 5 次操作），将 x 减到 0 。
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 <= nums.length <= 10<sup>5</sup></code></li>
 * <li><code>1 <= nums[i] <= 10<sup>4</sup></code></li>
 * <li><code>1 <= x <= 10<sup>9</sup></code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>哈希表</li><li>二分查找</li><li>前缀和</li><li>滑动窗口</li></div></div><br><div><li>👍 97</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 将 x 减到 0 的最小操作数
 *
 * @author MC
 * @date 2022-04-23 20:27:49
 */
class P1658_MinimumOperationsToReduceXToZero {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1658_MinimumOperationsToReduceXToZero().new Solution();
        int minOperations = solution.minOperations(new int[]{8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309},
        134365);
        System.out.println(minOperations);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minOperations(int[] nums, int x) {

            int total = 0;
            for (int i = 0; i < nums.length; i++) {
                total+=nums[i];
            }

            if(total < x){
                return -1;
            }

            int sum =total-x;
            int l = 0;
            int r = 0;
            int max = -1;
            int n = 0;
            if(nums[0] == sum){
                return nums.length-1;
            }
            while(r < nums.length && l <= r) {
                n+= nums[r];
                while(n > sum){
                    n-= nums[l];
                    l++;
                }
                if(n == sum){
                    max = Math.max(max,r-l+1);
                }

                r++;
            }
            if(max == -1){
                return -1;
            }else{
                return nums.length-max;
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
