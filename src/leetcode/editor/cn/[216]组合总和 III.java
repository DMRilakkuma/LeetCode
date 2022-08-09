package leetcode.editor.cn;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class CombinationSumIii {
    public static void main(String[] args) {
        Solution solution = new CombinationSumIii().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> list = new ArrayList<List<Integer>>();
            Deque<Integer> path = new ArrayDeque<Integer>();
            int total = 0;
            int start = 1;
            dfs(k, n, list, 1, path, total);
            return list;
        }

        public void dfs(int k, int n, List<List<Integer>> list, int start, Deque<Integer> path, int total) {
            if (total > n) {
                return;
            }
            if (path.size() == k) {
                if (total == n) {
                    list.add(new ArrayList<>(path));
                }
                return;
            }
            for (int i = start; i <= 9; i++) {
                path.addLast(i);
                total += i;
                dfs(k, n, list, i + 1, path, total);
                total -= i;
                path.removeLast();
            }
        }

    }

//leetcode submit region end(Prohibit modification and deletion)

}