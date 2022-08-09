/**
 * <p>给定一个二叉树的 <strong>根节点</strong> <code>root</code>，请找出该二叉树的 <strong>最底层 最左边 </strong>节点的值。</p>
 *
 * <p>假设二叉树中至少有一个节点。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <p><img src="https://assets.leetcode.com/uploads/2020/12/14/tree1.jpg" style="width: 182px; " /></p>
 *
 * <pre>
 * <strong>输入: </strong>root = [2,1,3]
 * <strong>输出: </strong>1
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <p><img src="https://assets.leetcode.com/uploads/2020/12/14/tree2.jpg" style="width: 242px; " /><strong> </strong></p>
 *
 * <pre>
 * <strong>输入: </strong>[1,2,3,4,null,5,6,null,null,7]
 * <strong>输出: </strong>7
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示:</strong></p>
 *
 * <ul>
 * <li>二叉树的节点个数的范围是 <code>[1,10<sup>4</sup>]</code></li>
 * <li><meta charset="UTF-8" /><code>-2<sup>31</sup> <= Node.val <= 2<sup>31</sup> - 1</code> </li>
 * </ul>
 * <div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 276</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 找树左下角的值
 *
 * @author MC
 * @date 2022-05-17 16:45:54
 */
class P513_FindBottomLeftTreeValue {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P513_FindBottomLeftTreeValue().new Solution();
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
        public int findBottomLeftValue(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int val = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode poll = queue.poll();
                    if (i == 0) {
                        val = poll.val;
                    }
                    if (poll.left != null) {
                        queue.offer(poll.left);
                    }
                    if (poll.right != null) {
                        queue.offer(poll.right);
                    }
                }
            }
            return val;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
