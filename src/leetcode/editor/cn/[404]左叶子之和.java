/**
 * <p>给定二叉树的根节点&nbsp;<code>root</code>&nbsp;，返回所有左叶子之和。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <p><img src="https://assets.leetcode.com/uploads/2021/04/08/leftsum-tree.jpg" /></p>
 *
 * <pre>
 * <strong>输入:</strong> root = [3,9,20,null,null,15,7]
 * <strong>输出:</strong> 24
 * <strong>解释:</strong> 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> root = [1]
 * <strong>输出:</strong> 0
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示:</strong></p>
 *
 * <ul>
 * <li>节点数在&nbsp;<code>[1, 1000]</code>&nbsp;范围内</li>
 * <li><code>-1000 &lt;= Node.val &lt;= 1000</code></li>
 * </ul>
 *
 * <p>&nbsp;</p>
 * <div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 452</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 左叶子之和
 * @author MC
 * @date 2022-05-17 16:21:37
 */
class P404_SumOfLeftLeaves {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P404_SumOfLeftLeaves().new Solution();
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
        public int sumOfLeftLeaves(TreeNode root) {
            if(root == null){
                return 0;
            }
            int total = 0;
            if(root.left != null && root.left.left == null && root.left.right == null){
                total+=root.left.val;
            }
            if(root.left != null){
                total+=sumOfLeftLeaves(root.left);
            }
            if(root.right != null){
                total+= sumOfLeftLeaves(root.right);
            }
            return total;

        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
