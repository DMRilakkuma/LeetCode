/**
 * <p>给定两个整数数组 <code>inorder</code> 和 <code>postorder</code> ，其中 <code>inorder</code> 是二叉树的中序遍历， <code>postorder</code> 是同一棵树的后序遍历，请你构造并返回这颗&nbsp;<em>二叉树</em>&nbsp;。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/tree.jpg" />
 * <pre>
 * <b>输入：</b>inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
 * <b>输出：</b>[3,9,20,null,null,15,7]
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <b>输入：</b>inorder = [-1], postorder = [-1]
 * <b>输出：</b>[-1]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= inorder.length &lt;= 3000</code></li>
 * <li><code>postorder.length == inorder.length</code></li>
 * <li><code>-3000 &lt;= inorder[i], postorder[i] &lt;= 3000</code></li>
 * <li><code>inorder</code>&nbsp;和&nbsp;<code>postorder</code>&nbsp;都由 <strong>不同</strong> 的值组成</li>
 * <li><code>postorder</code>&nbsp;中每一个值都在&nbsp;<code>inorder</code>&nbsp;中</li>
 * <li><code>inorder</code>&nbsp;<strong>保证</strong>是树的中序遍历</li>
 * <li><code>postorder</code>&nbsp;<strong>保证</strong>是树的后序遍历</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>树</li><li>数组</li><li>哈希表</li><li>分治</li><li>二叉树</li></div></div><br><div><li>👍 747</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 从中序与后序遍历序列构造二叉树
 *
 * @author MC
 * @date 2022-05-17 17:29:28
 */
class P106_ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P106_ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] post;

        public TreeNode buildTree(int[] inorder, int[] postorder) {
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
            post = postorder;
            return buildTree(0, inorder.length - 1, 0, post.length - 1);

        }

        public TreeNode buildTree(int inorderstart, int inorderend, int postorderstart, int postorderend) {
            if (inorderstart > inorderend || postorderstart > postorderend) {
                return null;
            }
            int root = post[postorderend];
            int mid = map.get(root);
            TreeNode node = new TreeNode(root);
            node.left = buildTree(inorderstart, mid - 1, postorderstart, postorderstart + mid - inorderstart - 1);
            node.right = buildTree(mid + 1, inorderend, postorderstart + mid - inorderstart, postorderend - 1);
            return node;
        }
    }
}
//leetcode submit region end(Prohibit modification and d