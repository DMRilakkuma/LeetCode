package leetcode.editor.cn;

import java.util.List;

class ShanChuLianBiaoDeJieDianLcof {
    public static void main(String[] args) {
        Solution solution = new ShanChuLianBiaoDeJieDianLcof().new Solution();

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
        public ListNode deleteNode(ListNode head, int val) {
            ListNode pre = new ListNode(0);
            ListNode cur = pre;
            pre.next = head;
            while (pre.next != null) {
                if (pre.next.val == val) {
                    pre.next = pre.next.next;
                    return cur.next;
                }
                pre = pre.next;
            }
            return null;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}