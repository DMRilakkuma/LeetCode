package leetcode.editor.cn;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Combinations {
    public static void main(String[] args) {
        Solution solution = new Combinations().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> list = new ArrayList<>();
            if (k <= 0 && k > n) {
                return null;
            }
            Deque<Integer> path = new ArrayDeque<>();
            dfs(n, k, 1, list, path);
            return list;
        }

        public void dfs(int n, int k, int start, List<List<Integer>> list, Deque<Integer> path) {
            if (path.size() == k) {
                list.add(new ArrayList<>(path));
                return ;
            }
            for (int i = start; i <= n ; i++) {
                path.addLast(i);
                dfs(n,k,i+1,list,path);
                path.removeLast();
            }

        }

        @Test
        public void test(){
            List<List<Integer>> list = combine(4, 2);
            System.out.println(list);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}