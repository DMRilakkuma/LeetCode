package leetcode.editor.cn;

/**
 * 给你两个按 非递减顺序 排列的整数数组nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * <p>
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * <p>
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，
 * 其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 * <p>
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 * @author shkstart
 * @create 2022-04-13 19:57
 */
public class 合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        int[] nums = new int[m + n];
        while (index1 < m && index2 < n) {
            if (nums1[index1] < nums2[index2]) {
                nums[index] = nums1[index1];
                index1++;
            } else {
                nums[index] = nums2[index2];
                index2++;
            }

            index++;
        }

        if (index1 >= m) {
            for (int i = index2; i < n; i++) {
                nums[index++] = nums2[i];
            }
        } else if (index2 >= n) {
            for (int i = index1; i < m; i++) {
                nums[index++] = nums1[i];

            }
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = nums[i];

        }

    }


}
