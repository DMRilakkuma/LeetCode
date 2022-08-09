package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class CombinationSum {
    public static void main(String[] args) {
        Solution solution = new CombinationSum().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> list = new ArrayList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {

            Deque<Integer> path = new ArrayDeque<>();
            dfs(path, candidates, target,0);
            return list;
        }

        public void dfs(Deque<Integer> path, int[] candidates, int target,int begin) {
            if (target == 0) {
                list.add(new ArrayList<>(path));
                return;
            }
            if (target < 0) {
                return;
            }
            for (int i = begin; i < candidates.length; i++) {
                path.addLast(candidates[i]);
                dfs(path, candidates, target - candidates[i],i);
                path.removeLast();
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}