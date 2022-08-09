import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: MC
 * @Pcakage: PACKAGE_NAME.统计得分小于K的子数组数目
 * @Date: 2022年06月11日 23:37
 * @Description:
 */
public class 统计得分小于K的子数组数目 {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        Arrays.sort(nums);
        long total = (long) nums[0] * n;
        int count = 0;
        int l = 0;
        int r = 0;
        while (r < n && l <= r) {
            total += (long) nums[r] * n;
            if (total <= k) {
                count += r - l + 1;
                r++;
            } else {
                total -= (long) nums[l] * n;
                l++;
            }
        }
        return count;

    }

    @Test
    public void test() {
        int nums[] = {2, 1, 4, 3, 5};
        long k = 10;
        long l = countSubarrays(nums, k);
        System.out.println(l);
    }

}