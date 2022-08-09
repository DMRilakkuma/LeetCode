package leetcode.editor.cn;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 *
 * @author shkstart
 * @create 2022-03-24 21:40
 */
public class Main35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        int index = 0;
        if (target < nums[0]) {
            index = 0;

        }
        if (target > nums[nums.length - 1]) {
            index = nums.length;

        }
        while (left <= right) {


            if (target != nums[left] && target != nums[right]) {
                if (right - left == 1) {
                    index = right;
                    break;

                }

            }
            if (target == nums[mid]) {
                index = mid;
                break;

            } else if (target < nums[mid]) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }


        }
        return index;

    }
}
