package leetcode.editor.cn;

class FindPeakElement {
    public static void main(String[] args) {
        Solution solution = new FindPeakElement().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findPeakElement(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                    return mid;
                }
                if (nums[mid] > nums[left] && nums[mid] > nums[right]) {
                    left++;
                    right--;
                }
            }

            return 0;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}