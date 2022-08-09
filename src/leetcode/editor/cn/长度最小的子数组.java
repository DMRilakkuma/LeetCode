package leetcode.editor.cn;

import org.junit.Test;

/**
 * 给定一个含有个正整数的数组和一个正整数 target 。
 * <p>
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 *
 * @author shkstart
 * @create 2022-04-15 21:02
 */
public class 长度最小的子数组 {
    public int minSubArrayLen(int target, int[] nums) {
      int n = nums.length;
      int start = 0;
      int end = 0;
      int ans =Integer.MAX_VALUE;
      int sum = 0;
      while(end < n){
          sum+=nums[end];
          while(sum >= target){
              ans = Math.min(ans,end-start+1);
              sum-= nums[start];
              start++;
          }

          end++;
      }

      return ans == Integer.MAX_VALUE ? 0 : ans;


    }

    @Test
    public void test() {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int arrayLen = minSubArrayLen(target, nums);
        System.out.println(arrayLen);
    }

}
