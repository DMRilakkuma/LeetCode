package leetcode.editor.cn;

class JuZhenZhongDeLuJingLcof {
    public static void main(String[] args) {
        Solution solution = new JuZhenZhongDeLuJingLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        boolean[][] judge;


        public boolean exist(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;
            judge = new boolean[m][n];
            boolean isFlag = false;
            int k = 0;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (dfs(i, j, word, board, k)) {
                        return true;
                    }
                }
            }
            return false;


        }

        public boolean dfs(int x, int y, String word, char[][] board, int k) {
            if (x >= board.length || x < 0 || y >= board[0].length || y < 0) {
                return false;
            }
            if (judge[x][y] || board[x][y] != word.charAt(k)) {
                return false;
            }

            if (k == word.length() - 1) {
                return true;
            }

            if (board[x][y] == word.charAt(k)) {
                judge[x][y] = true;
            }

            boolean res = dfs(x, y + 1, word, board, k + 1) ||
                    dfs(x + 1, y, word, board, k + 1) ||
                    dfs(x, y - 1, word, board, k + 1) ||
                    dfs(x - 1, y, word, board, k + 1);

            judge[x][y] = false;
            return res;

        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}