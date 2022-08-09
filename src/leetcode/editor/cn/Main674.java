package leetcode.editor.cn;

/**
 * @author MC
 * @create 2022-04-22 16:30
 * @Description: 最长连续递增序列
 *
 * 给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
 *
 * 连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1] ，
 * 那么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。
 *

 */
public class Main674 {

    public int findLengthOfLCIS(int[] nums) {
//        int l = 0;
//        int r = 0;
//        int max = 0;
//        while(r < nums.length){
//            if(r+1 < nums.length && nums[r] < nums[r+1]){
//                r++;
//            }else{
//                if(r-l+1 > max){
//                    max = r-l+1;
//                }
//                r = r+1;
//
//                while(l < r){
//                    l++;
//                }
//
//            }
//
//            if(r+1 >= nums.length){
//                if(r-l+1 > max){
//                    max = r-l+1;
//                }
//
//                break;
//            }
//        }
//
//
//
//        return max;



       int count = 1;
        int max = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1] > nums[i]){
                count++;
            }else{

                count = 1;
            }

            if(count > max){
                max = count;
            }
        }
        return max;

    }


}
