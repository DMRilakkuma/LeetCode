/**
 * 给你一个链表的头节点 <code>head</code> 和一个整数 <code>val</code> ，请你删除链表中所有满足 <code>Node.val == val</code> 的节点，并返回 <strong>新的头节点</strong> 。
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/03/06/removelinked-list.jpg" style="width: 500px; height: 142px;" />
 * <pre>
 * <strong>输入：</strong>head = [1,2,6,3,4,5,6], val = 6
 * <strong>输出：</strong>[1,2,3,4,5]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>head = [], val = 1
 * <strong>输出：</strong>[]
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>head = [7,7,7,7], val = 7
 * <strong>输出：</strong>[]
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li>列表中的节点数目在范围 <code>[0, 10<sup>4</sup>]</code> 内</li>
 * <li><code>1 <= Node.val <= 50</code></li>
 * <li><code>0 <= val <= 50</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>递归</li><li>链表</li></div></div><br><div><li>👍 903</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * 移除链表元素
 *
 * @author MC
 * @date 2022-05-11 17:08:37
 */
class P203_RemoveLinkedListElements {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P203_RemoveLinkedListElements().new Solution();
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)


    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode pre = new ListNode(0);
            pre.next = head;
            ListNode cur = pre;
            while (cur.next != null) {
                if (cur.next.val == val) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }
            return pre.next;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
