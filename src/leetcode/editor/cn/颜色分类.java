package leetcode.editor.cn;

/**
 * 给定一个包含红色、白色和蓝色、共n 个元素的数组nums，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。
 *
 * 必须在不使用库的sort函数的情况下解决这个问题。
 *
 * @author shkstart
 * @create 2022-04-12 17:57
 */
public class 颜色分类 {
    public void sortColors(int[] nums) {

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length-i-1; j++) {
//                if(nums[j] > nums[j+1]){
//                    int temp = nums[j+1];
//                    nums[j+1] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(nums));
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[pre];
                nums[pre++] = temp;
            }
        }

        for (int i = pre; i < nums.length; i++) {
            if(nums[i] == 1){
                int temp = nums[i];
                nums[i] = nums[pre];
                nums[pre++] = temp;
            }

        }

    }


}
