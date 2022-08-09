package leetcode.editor.cn;

class ShuDeZiJieGouLcof {
    public static void main(String[] args) {
        Solution solution = new ShuDeZiJieGouLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isSubStructure(TreeNode A, TreeNode B) {
            if (A == null || B == null) {
                return false;
            }
            return recursion(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);

        }

        public boolean recursion(TreeNode A, TreeNode B) {
            if (B == null) {
                return true;
            }
            if (A == null) {
                return false;
            }

            return A.val == B.val && recursion(A.left, B.left) && recursion(A.right, B.right);

        }
//leetcode submit region end(Prohibit modification and deletion)

    }
}