package leetcode.editor.cn;

class BaShuZuPaiChengZuiXiaoDeShuLcof {
    public static void main(String[] args) {
        Solution solution = new BaShuZuPaiChengZuiXiaoDeShuLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String minNumber(int[] nums) {
            String[] s = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                s[i] = String.valueOf(nums[i]);
            }

            for (int i = 0; i < s.length - 1; i++) {
                for (int j = 0; j < s.length - i - 1; j++) {

                }
            }
            return "";
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}