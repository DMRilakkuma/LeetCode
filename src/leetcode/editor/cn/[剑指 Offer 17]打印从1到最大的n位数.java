package leetcode.editor.cn;

class DaYinCong1daoZuiDaDeNweiShuLcof {
    public static void main(String[] args) {
        Solution solution = new DaYinCong1daoZuiDaDeNweiShuLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] printNumbers(int n) {
            int num = 1;
            for (int i = 0; i < n; i++) {
                num *= 10;
            }
            int[] array = new int[num];
            for (int i = 0; i < num-1; i++) {
                array[i] = i+1;
            }
            return array;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}