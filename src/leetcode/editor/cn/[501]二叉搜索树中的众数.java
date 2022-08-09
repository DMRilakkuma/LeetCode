/**
 * <p>给你一个含重复值的二叉搜索树（BST）的根节点 <code>root</code> ，找出并返回 BST 中的所有 <a href="https://baike.baidu.com/item/%E4%BC%97%E6%95%B0/44796" target="_blank">众数</a>（即，出现频率最高的元素）。</p>
 *
 * <p>如果树中有不止一个众数，可以按 <strong>任意顺序</strong> 返回。</p>
 *
 * <p>假定 BST 满足如下定义：</p>
 *
 * <ul>
 * <li>结点左子树中所含节点的值 <strong>小于等于</strong> 当前节点的值</li>
 * <li>结点右子树中所含节点的值 <strong>大于等于</strong> 当前节点的值</li>
 * <li>左子树和右子树都是二叉搜索树</li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/03/11/mode-tree.jpg" style="width: 142px; height: 222px;" />
 * <pre>
 * <strong>输入：</strong>root = [1,null,2,2]
 * <strong>输出：</strong>[2]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>root = [0]
 * <strong>输出：</strong>[0]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li>树中节点的数目在范围 <code>[1, 10<sup>4</sup>]</code> 内</li>
 * <li><code>-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>进阶：</strong>你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）</p>
 * <div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>二叉搜索树</li><li>二叉树</li></div></div><br><div><li>👍 459</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉搜索树中的众数
 *
 * @author MC
 * @date 2022-05-18 17:31:40
 */
class P501_FindModeInBinarySearchTree {
    public static  void main(String[] args) {

        //测试代码

    }
    @Test
    public void test(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        Solution solution = new Solution();
        solution.findMode(root);
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
        int pre = 0;
        int count = 0;
        int max = 0;
        List<Integer> list = new ArrayList<>();

        public int[] findMode(TreeNode root) {
            traverse(root);
            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;

        }

        public void traverse(TreeNode root) {
            if (root == null) {
                return;
            }
            traverse(root.left);
            if ( pre == root.val) {
                count++;
            } else {
                pre = root.val;
                count = 1;
            }
            if (count == max) {
                list.add(root.val);
            } else if (count > max) {
                list.clear();
                list.add(root.val);
                max = count;
            }
            traverse(root.right);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
