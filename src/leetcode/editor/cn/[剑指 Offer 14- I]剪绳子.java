package leetcode.editor.cn;

class JianShengZiLcof {
    public static void main(String[] args) {
        Solution solution = new JianShengZiLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int cuttingRope(int n) {
            if (n <= 3) {
                return n - 1;
            }

            int a = n / 3;
            int b = n % 3;
            if (b == 0) {
                return (int) Math.pow(3, a);
            }
            if (b == 1) {
                return (int) (Math.pow(3,a-1)* 4);
            }
            return (int) (Math.pow(3,a)*2);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}