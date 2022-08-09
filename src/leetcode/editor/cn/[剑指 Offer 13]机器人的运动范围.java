package leetcode.editor.cn;

class JiQiRenDeYunDongFanWeiLcof {
    public static void main(String[] args) {
        Solution solution = new JiQiRenDeYunDongFanWeiLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        boolean[][] isFlag;


        public int movingCount(int m, int n, int k) {
            isFlag = new boolean[m][n];
            return dfs(0, 0, k);
        }

        public int dfs(int m, int n, int k) {
            if (m >= isFlag.length || m < 0 || n >= isFlag[0].length || n < 0) {
                return 0;
            }
            String s = m + "" + n;
            int total = 0;
            for (int i = 0; i < s.length(); i++) {
                total += s.charAt(i) - '0';
            }
            if (total > k || isFlag[m][n]) {
                return 0;
            }
            isFlag[m][n] = true;


            return dfs(m, n + 1, k) +
                    dfs(m + 1, n, k) +
                    dfs(m, n - 1, k) +
                    dfs(m - 1, n, k)+1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}