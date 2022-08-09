/**
 * <p>给你一个二叉搜索树的根节点 <code>root</code> ，返回 <strong>树中任意两不同节点值之间的最小差值</strong> 。</p>
 *
 * <p>差值是一个正数，其数值等于两值之差的绝对值。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/02/05/bst1.jpg" style="width: 292px; height: 301px;" />
 * <pre>
 * <strong>输入：</strong>root = [4,2,6,1,3]
 * <strong>输出：</strong>1
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/02/05/bst2.jpg" style="width: 282px; height: 301px;" />
 * <pre>
 * <strong>输入：</strong>root = [1,0,48,null,null,12,49]
 * <strong>输出：</strong>1
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li>树中节点的数目范围是 <code>[2, 10<sup>4</sup>]</code></li>
 * <li><code>0 &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>注意：</strong>本题与 783 <a href="https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/">https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/</a> 相同</p>
 * <div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li><li>二叉搜索树</li><li>二叉树</li></div></div><br><div><li>👍 342</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 二叉搜索树的最小绝对差
 *
 * @author MC
 * @date 2022-05-18 16:46:31
 */
class P530_MinimumAbsoluteDifferenceInBst {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P530_MinimumAbsoluteDifferenceInBst().new Solution();
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
        private int min = Integer.MAX_VALUE;

        public int getMinimumDifference(TreeNode root) {
            if (min == 1) {
                return 1;
            }

            if (root.left != null) {
                TreeNode leftMax = root.left;
                while (leftMax.right != null) {
                    leftMax = leftMax.right;
                }
                min = Math.min(root.val - leftMax.val, min);
                getMinimumDifference(root.left);
            }

            if (root.right != null) {
                TreeNode rightMin = root.right;
                while(rightMin.left != null){
                    rightMin = rightMin.left;
                }
                min = Math.min(rightMin.val - root.val,min);
                getMinimumDifference(root.right);
            }

            return min;

        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
