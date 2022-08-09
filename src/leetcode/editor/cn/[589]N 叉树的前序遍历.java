/**
 * <p>给定一个 n&nbsp;叉树的根节点 <meta charset="UTF-8" />&nbsp;<code>root</code>&nbsp;，返回 <em>其节点值的<strong> 前序遍历</strong></em> 。</p>
 *
 * <p>n 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 <code>null</code> 分隔（请参见示例）。</p>
 *
 * <p><br />
 * <strong>示例 1：</strong></p>
 *
 * <p><img src="https://assets.leetcode.com/uploads/2018/10/12/narytreeexample.png" style="height: 193px; width: 300px;" /></p>
 *
 * <pre>
 * <strong>输入：</strong>root = [1,null,3,2,4,null,5,6]
 * <strong>输出：</strong>[1,3,5,6,2,4]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <p><img alt="" src="https://assets.leetcode.com/uploads/2019/11/08/sample_4_964.png" style="height: 272px; width: 300px;" /></p>
 *
 * <pre>
 * <strong>输入：</strong>root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * <strong>输出：</strong>[1,2,3,6,7,11,14,4,8,12,5,9,13,10]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li>节点总数在范围<meta charset="UTF-8" />&nbsp;<code>[0, 10<sup>4</sup>]</code>内</li>
 * <li><code>0 &lt;= Node.val &lt;= 10<sup>4</sup></code></li>
 * <li>n 叉树的高度小于或等于 <code>1000</code></li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>进阶：</strong>递归法很简单，你可以使用迭代法完成此题吗?</p>
 * <div><div>Related Topics</div><div><li>栈</li><li>树</li><li>深度优先搜索</li></div></div><br><div><li>👍 277</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * N 叉树的前序遍历
 *
 * @author MC
 * @date 2022-05-14 17:18:05
 */
class P589_NAryTreePreorderTraversal {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P589_NAryTreePreorderTraversal().new Solution();
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
        public List<Integer> preorder(Node root) {
            List<Integer> list = new ArrayList<>();
            helper(root,list);
            return list;
        }

        public List<Integer> helper(Node root,List<Integer> list){
            if(root == null){
                return null;
            }
            list.add(root.val);
            for(Node ch : root.children){
                helper(ch,list);
            }
            return list;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
