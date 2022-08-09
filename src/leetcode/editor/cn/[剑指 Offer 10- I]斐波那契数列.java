package leetcode.editor.cn;

class FeiBoNaQiShuLieLcof {
    public static void main(String[] args) {
        Solution solution = new FeiBoNaQiShuLieLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int fib(int n) {
            if (n == 0) {
                return 0;
            }
            int[] sequence = new int[n + 1];
            sequence[0] = 0;
            sequence[1] = 1;

            for (int i = 2; i <= n; i++) {
                sequence[i] = (sequence[i - 1] + sequence[i - 2]) % 1000000007;
            }
            return sequence[n];

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}