package leetcode.editor.cn;

class DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof {
    public static void main(String[] args) {
        Solution solution = new DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] exchange(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                while (left < right && nums[left] % 2 == 1) {
                    left++;
                }

                while (left < right && nums[right] % 2 == 0) {
                    right--;
                }

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            return nums;

        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}