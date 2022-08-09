package leetcode.editor.cn;

/**
 * @author MC
 * @create 2022-04-22 17:08
 * @Description: 子数组最大平均数 I
 *
 * 给你一个由 n 个元素组成的整数数组 nums 和一个整数 k 。
 *
 * 请你找出平均数最大且 长度为 k 的连续子数组，并输出该最大平均数。
 *
 * 任何误差小于 10-5 的答案都将被视为正确答案。
 *
 * 输入：nums = [1,12,-5,-6,50,3], k = 4
 * 输出：12.75
 * 解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 *

 */
public class Main643 {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0;
        for (int i = 0; i < k; i++) {
            ans+=nums[i];
        }
        
        double sum = ans;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i-k]+nums[i];
            ans = Math.max(ans,sum);
        }

        return ans / k;
    }

}
