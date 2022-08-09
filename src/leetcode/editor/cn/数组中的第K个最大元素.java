package leetcode.editor.cn;

/**
 * @author shkstart
 * @create 2022-04-12 22:20
 */
public class 数组中的第K个最大元素 {
    public int findKthLargest(int[] nums, int k) {
//        Arrays.sort(nums);
//        return nums[nums.length -k +1];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }
        }

        return nums[nums.length -k];

    }
}
