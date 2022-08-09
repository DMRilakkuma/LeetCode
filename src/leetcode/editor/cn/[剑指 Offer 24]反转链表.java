package leetcode.editor.cn;

import java.util.Stack;

class FanZhuanLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new FanZhuanLianBiaoLcof().new Solution();

    }

//leetcode submit region begin(Prohibit modification and deletion)

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            Stack<ListNode> stack = new Stack<>();

            while (head != null) {
                stack.push(head);
                head = head.next;
            }

            ListNode pre = new ListNode(0);
            ListNode cur = pre;
            while (!stack.isEmpty()) {
                pre.next = stack.pop();
                pre = pre.next;
            }
            pre.next = null;
            return cur.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}