/**
 * <p>给定一个 N 叉树，找到其最大深度。</p>
 *
 * <p class="MachineTrans-lang-zh-CN">最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。</p>
 *
 * <p class="MachineTrans-lang-zh-CN">N 叉树输入按层序遍历序列化表示，每组子节点由空值分隔（请参见示例）。</p>
 *
 * <p class="MachineTrans-lang-zh-CN"> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <p><img src="https://assets.leetcode.com/uploads/2018/10/12/narytreeexample.png" style="width: 100%; max-width: 300px;" /></p>
 *
 * <pre>
 * <strong>输入：</strong>root = [1,null,3,2,4,null,5,6]
 * <strong>输出：</strong>3
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <p><img alt="" src="https://assets.leetcode.com/uploads/2019/11/08/sample_4_964.png" style="width: 296px; height: 241px;" /></p>
 *
 * <pre>
 * <strong>输入：</strong>root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * <strong>输出：</strong>5
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li>树的深度不会超过 <code>1000</code> 。</li>
 * <li>树的节点数目位于 <code>[0, 10<sup>4</sup>]</code> 之间。</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li></div></div><br><div><li>👍 275</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * N 叉树的最大深度
 *
 * @author MC
 * @date 2022-05-15 21:38:36
 */
class P559_MaximumDepthOfNAryTree {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P559_MaximumDepthOfNAryTree().new Solution();
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    ;

    class Solution {
        public int maxDepth(Node root) {
            if (root == null) {
                return 0;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            int depth = 0;
            while (!queue.isEmpty()) {
                depth++;
                int size = queue.size();
                while (size > 0) {
                    Node poll = queue.poll();
                    size--;
                    for (Node ch : poll.children){
                        if(ch != null){
                            queue.offer(ch);
                        }
                    }
                }
            }
            return depth;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
