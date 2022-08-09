/**
 * <p>给定一个正整数数组 <code>nums</code>和一个整数 <font color="#c7254e"><font face="Menlo, Monaco, Consolas, Courier New, monospace"><span style="font-size:12.6px"><span style="background-color:#f9f2f4">k</span></span></font></font>&nbsp;，返回 <font color="#c7254e"><font face="Menlo, Monaco, Consolas, Courier New, monospace"><span style="font-size:12.6px"><span style="background-color:#f9f2f4">num</span></span></font></font>&nbsp;中 「<strong>好子数组」</strong><em>&nbsp;</em>的数目。</p>
 *
 * <p>如果 <code>nums</code>&nbsp;的某个子数组中不同整数的个数恰好为 <code>k</code>，则称 <code>nums</code>&nbsp;的这个连续、不一定不同的子数组为 <strong>「</strong><strong>好子数组 」</strong>。</p>
 *
 * <ul>
 * <li>例如，<code>[1,2,3,1,2]</code> 中有&nbsp;<code>3</code>&nbsp;个不同的整数：<code>1</code>，<code>2</code>，以及&nbsp;<code>3</code>。</li>
 * </ul>
 *
 * <p><strong>子数组</strong> 是数组的 <strong>连续</strong> 部分。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [1,2,1,2,3], k = 2
 * <strong>输出：</strong>7
 * <strong>解释：</strong>恰好由 2 个不同整数组成的子数组：[1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2].
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>nums = [1,2,1,3,4], k = 3
 * <strong>输出：</strong>3
 * <strong>解释：</strong>恰好由 3 个不同整数组成的子数组：[1,2,1,3], [2,1,3], [1,3,4].
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 2 * 10<sup>4</sup></code></li>
 * <li><code>1 &lt;= nums[i], k &lt;= nums.length</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>哈希表</li><li>计数</li><li>滑动窗口</li></div></div><br><div><li>👍 378</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import com.sun.deploy.util.JVMParameters;

import java.util.*;

/**
 * K 个不同整数的子数组
 *
 * @author MC
 * @date 2022-05-02 19:15:19
 */
class P992_SubarraysWithKDifferentIntegers {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P992_SubarraysWithKDifferentIntegers().new Solution();
        int i = solution.subarraysWithKDistinct(new int[]{2, 1, 1, 1, 2}, 1);
        System.out.println(i);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int subarraysWithKDistinct(int[] nums, int k) {
            return arrQuantity(nums,k) - arrQuantity(nums,k-1);
        }

        public int arrQuantity(int [] nums, int k){
            int n = nums.length;
            int [] arr = new int [n+1];
            int l = 0;
            int r = 0;
            int count = 0;
            int res = 0;
            while(r < nums.length){
                if(arr[nums[r]]++ == 0){
                    count++;
                }
                r++;
                while(count > k){
                    if(--arr[nums[l]]==0){
                        count--;
                    }
                    l++;
                }


                res += r - l;
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    }
