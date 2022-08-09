/**
 * <p>给定两个整数数组&nbsp;<code>preorder</code> 和 <code>inorder</code>&nbsp;，其中&nbsp;<code>preorder</code> 是二叉树的<strong>先序遍历</strong>， <code>inorder</code>&nbsp;是同一棵树的<strong>中序遍历</strong>，请构造二叉树并返回其根节点。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/tree.jpg" style="height: 302px; width: 277px;" />
 * <pre>
 * <strong>输入</strong><strong>:</strong> preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * <strong>输出:</strong> [3,9,20,null,null,15,7]
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> preorder = [-1], inorder = [-1]
 * <strong>输出:</strong> [-1]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= preorder.length &lt;= 3000</code></li>
 * <li><code>inorder.length == preorder.length</code></li>
 * <li><code>-3000 &lt;= preorder[i], inorder[i] &lt;= 3000</code></li>
 * <li><code>preorder</code>&nbsp;和&nbsp;<code>inorder</code>&nbsp;均 <strong>无重复</strong> 元素</li>
 * <li><code>inorder</code>&nbsp;均出现在&nbsp;<code>preorder</code></li>
 * <li><code>preorder</code>&nbsp;<strong>保证</strong> 为二叉树的前序遍历序列</li>
 * <li><code>inorder</code>&nbsp;<strong>保证</strong> 为二叉树的中序遍历序列</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>树</li><li>数组</li><li>哈希表</li><li>分治</li><li>二叉树</li></div></div><br><div><li>👍 1594</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 从前序与中序遍历序列构造二叉树
 *
 * @author MC
 * @date 2022-05-17 21:24:03
 */
class P105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P105_ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
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
        int[] pre;

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
            pre = preorder;
            return buildTree(0, preorder.length - 1, 0, inorder.length - 1);
        }

        public TreeNode buildTree(int preorderstart, int preorderend, int inorderstart, int inorderend) {
            if (preorderstart > preorderend || inorderstart > inorderend) {
                return null;
            }
            int root = pre[preorderstart];
            int mid = map.get(root);
            TreeNode node = new TreeNode(root);
            node.left = buildTree(preorderstart+1, preorderstart+mid-inorderstart, inorderstart, mid - 1);
            node.right = buildTree(preorderstart+mid-inorderstart + 1, preorderend, mid+1, inorderend);
            return node;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
