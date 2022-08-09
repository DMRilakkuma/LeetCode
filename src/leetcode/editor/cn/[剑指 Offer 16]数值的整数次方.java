package leetcode.editor.cn;

class ShuZhiDeZhengShuCiFangLcof {
    public static void main(String[] args) {
        Solution solution = new ShuZhiDeZhengShuCiFangLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double myPow(double x, int n) {
            if (n == 0) {
                return 1;
            }
            double product = 1;
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    product *= x;
                }

            }

            if (n < 0) {
                for (int i = 0; i < -n; i++) {
                    product /= x;
                }
            }

            return product;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}