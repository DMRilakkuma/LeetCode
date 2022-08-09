package leetcode.editor.cn;

import java.util.*;

class PalindromePartitioning {
    public static void main(String[] args) {
        Solution solution = new PalindromePartitioning().new Solution();
        solution.partition("aab");

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> list = new ArrayList<>();
            LinkedList<String> path = new LinkedList<>();
            int index = 0;
            int len = s.length();
            dfs(s, list, path, 0, len);
            return list;

        }

        public void dfs(String s, List<List<String>> list, LinkedList<String> path, int index, int len) {
            if (index == len) {
                list.add(new ArrayList<>(path));
                return;
            }
            for (int i = index; i < len; i++) {
                if (!numberOfPalindromes(s, index, i)) {
                    continue;
                }
                path.addLast(s.substring(index, i + 1));
                dfs(s, list, path, i + 1, len);
                path.removeLast();
            }
        }

        public boolean numberOfPalindromes(String s, int left, int right) {
            while (left <= right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}