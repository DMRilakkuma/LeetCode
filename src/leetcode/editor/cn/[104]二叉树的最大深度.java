/**
 * <p>给定一个二叉树，找出其最大深度。</p>
 *
 * <p>二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。</p>
 *
 * <p><strong>说明:</strong>&nbsp;叶子节点是指没有子节点的节点。</p>
 *
 * <p><strong>示例：</strong><br>
 * 给定二叉树 <code>[3,9,20,null,null,15,7]</code>，</p>
 *
 * <pre>    3
 * / \
 * 9  20
 * /  \
 * 15   7</pre>
 *
 * <p>返回它的最大深度&nbsp;3 。</p>
 * <div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 1241</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的最大深度
 *
 * @author MC
 * @date 2022-05-15 20:55:10
 */
class P104_MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P104_MaximumDepthOfBinaryTree().new Solution();
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
        public int maxDepth(TreeNode root) {
            if(root == null){
                return 0 ;
            }
            Queue <TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int depth = 1;
            while(!queue.isEmpty()){
                depth++;
                int size = queue.size();
                while(size > 0){
                    TreeNode poll = queue.poll();
                    size--;
                    if(poll.left != null){
                        queue.offer(poll.left);
                    }
                    if(poll.right != null){
                        queue.offer(poll.right);
                    }
                }
            }
            return depth;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
