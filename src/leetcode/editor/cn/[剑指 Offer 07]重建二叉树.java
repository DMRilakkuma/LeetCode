package leetcode.editor.cn;

import java.awt.*;
import java.util.HashMap;

class ZhongJianErChaShuLcof {
    public static void main(String[] args) {
        Solution solution = new ZhongJianErChaShuLcof().new Solution();

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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
            return recursion(0, 0, inorder.length - 1, preorder, map);
        }

        public TreeNode recursion(int root, int left, int right, int[] preorder, HashMap<Integer, Integer> map) {
            if (left > right) {
                return null;
            }
            TreeNode node = new TreeNode(preorder[root]);
            int mid = map.get(preorder[root]);
            node.left = recursion(root + 1, left, mid - 1, preorder, map);
            node.right = recursion(root + mid-left+1,mid+1,right,preorder,map );
            return node;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}