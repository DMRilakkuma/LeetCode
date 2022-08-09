package leetcode.editor.cn;

/**
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * <p>
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 *
 * @author shkstart
 * @create 2022-03-25 16:50
 */
public class Main189 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        resver(nums, 0, n - 1);
        resver(nums, 0, k - 1);
        resver(nums, k, n - 1);


    }


    public static void resver(int[] nums, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        rotate(nums, 2);
    }


}
