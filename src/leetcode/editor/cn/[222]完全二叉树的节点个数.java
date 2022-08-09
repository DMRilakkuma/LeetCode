/**
 * <p>给你一棵<strong> 完全二叉树</strong> 的根节点 <code>root</code> ，求出该树的节点个数。</p>
 *
 * <p><a href="https://baike.baidu.com/item/%E5%AE%8C%E5%85%A8%E4%BA%8C%E5%8F%89%E6%A0%91/7773232?fr=aladdin">完全二叉树</a> 的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 <code>h</code> 层，则该层包含 <code>1~ 2<sup>h</sup></code> 个节点。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/01/14/complete.jpg" style="width: 372px; height: 302px;" />
 * <pre>
 * <strong>输入：</strong>root = [1,2,3,4,5,6]
 * <strong>输出：</strong>6
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>root = []
 * <strong>输出：</strong>0
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>root = [1]
 * <strong>输出：</strong>1
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li>树中节点的数目范围是<code>[0, 5 * 10<sup>4</sup>]</code></li>
 * <li><code>0 <= Node.val <= 5 * 10<sup>4</sup></code></li>
 * <li>题目数据保证输入的树是 <strong>完全二叉树</strong></li>
 * </ul>
 *
 * <p> </p>
 *
 * <p><strong>进阶：</strong>遍历树来统计节点是一种时间复杂度为 <code>O(n)</code> 的简单解决方案。你可以设计一个更快的算法吗？</p>
 * <div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>二分查找</li><li>二叉树</li></div></div><br><div><li>👍 685</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 完全二叉树的节点个数
 * @author MC
 * @date 2022-05-16 21:38:34
 */
class P222_CountCompleteTreeNodes {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P222_CountCompleteTreeNodes().new Solution();
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
        public int countNodes(TreeNode root) {
            if(root == null){
                return 0;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int count = 0;
            while(!queue.isEmpty()){
                TreeNode poll = queue.poll();
                count++;
                if(poll.left != null){
                    queue.offer(poll.left);
                }
                if(poll.right != null){
                    queue.offer(poll.right);
                }
            }
            return count;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
