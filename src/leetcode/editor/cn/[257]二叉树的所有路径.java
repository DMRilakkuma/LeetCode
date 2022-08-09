/**
 * <p>给你一个二叉树的根节点 <code>root</code> ，按 <strong>任意顺序</strong> ，返回所有从根节点到叶子节点的路径。</p>
 *
 * <p><strong>叶子节点</strong> 是指没有子节点的节点。</p>
 * &nbsp;
 *
 * <p><strong>示例 1：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/03/12/paths-tree.jpg" style="width: 207px; height: 293px;" />
 * <pre>
 * <strong>输入：</strong>root = [1,2,3,null,5]
 * <strong>输出：</strong>["1-&gt;2-&gt;5","1-&gt;3"]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>root = [1]
 * <strong>输出：</strong>["1"]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li>树中节点的数目在范围 <code>[1, 100]</code> 内</li>
 * <li><code>-100 &lt;= Node.val &lt;= 100</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>字符串</li><li>回溯</li><li>二叉树</li></div></div><br><div><li>👍 736</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的所有路径
 *
 * @author MC
 * @date 2022-05-16 22:21:19
 */
class P257_BinaryTreePaths {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P257_BinaryTreePaths().new Solution();
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> list = new ArrayList<>();
            List<Integer> paths = new ArrayList<>();
            dfs(root,list,paths);
            return list;
        }

        public void dfs(TreeNode root, List<String> list, List<Integer> paths) {
            paths.add(root.val);
            if (root.left == null && root.right == null) {
                StringBuffer s = new StringBuffer();
                for (int i = 0; i < paths.size() - 1; i++) {
                    s.append(paths.get(i)).append("->");
                }
                s.append(paths.get(paths.size() - 1));
                list.add(String.valueOf(s));
                return;
            }

            if (root.left != null) {
                dfs(root.left,list,paths);
                paths.remove(paths.size()-1);
            }

            if(root.right != null){
                dfs(root.right,list,paths);
                paths.remove(paths.size()-1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
