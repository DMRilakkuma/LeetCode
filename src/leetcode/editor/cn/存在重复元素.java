package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 * 输入：nums = [1,2,3,1]
 * 输出：true
 *
 * 输入：nums = [1,2,3,4]
 * 输出：false
 * @author shkstart
 * @create 2022-04-17 10:09
 */
public class 存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){
                return true;
            }

        }
        return false;

    }


}
