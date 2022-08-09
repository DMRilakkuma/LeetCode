/**
 * <p>给你二叉树的根节点&nbsp;<code>root</code> 和一个表示目标和的整数&nbsp;<code>targetSum</code> 。判断该树中是否存在 <strong>根节点到叶子节点</strong> 的路径，这条路径上所有节点值相加等于目标和&nbsp;<code>targetSum</code> 。如果存在，返回 <code>true</code> ；否则，返回 <code>false</code> 。</p>
 *
 * <p><strong>叶子节点</strong> 是指没有子节点的节点。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/01/18/pathsum1.jpg" style="width: 500px; height: 356px;" />
 * <pre>
 * <strong>输入：</strong>root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * <strong>输出：</strong>true
 * <strong>解释：</strong>等于目标和的根节点到叶节点路径如上图所示。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/01/18/pathsum2.jpg" />
 * <pre>
 * <strong>输入：</strong>root = [1,2,3], targetSum = 5
 * <strong>输出：</strong>false
 * <strong>解释：</strong>树中存在两条根节点到叶子节点的路径：
 * (1 --&gt; 2): 和为 3
 * (1 --&gt; 3): 和为 4
 * 不存在 sum = 5 的根节点到叶子节点的路径。</pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>root = [], targetSum = 0
 * <strong>输出：</strong>false
 * <strong>解释：</strong>由于树是空的，所以不存在根节点到叶子节点的路径。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li>树中节点的数目在范围 <code>[0, 5000]</code> 内</li>
 * <li><code>-1000 &lt;= Node.val &lt;= 1000</code></li>
 * <li><code>-1000 &lt;= targetSum &lt;= 1000</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 886</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 路径总和
 * @author MC
 * @date 2022-05-17 17:07:30
 */
class P112_PathSum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P112_PathSum().new Solution();
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
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if(root == null){
                return false;
            }
            if(root.left == null && root.right == null){
                  return root.val == targetSum;
            }

            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right,targetSum-root.val) ;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
