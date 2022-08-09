package leetcode.editor.cn;

class HeBingLiangGePaiXuDeLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new HeBingLiangGePaiXuDeLianBiaoLcof().new Solution();

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
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(0);
            ListNode pre = head;

            while (l1 != null && l2 != null) {
                if (l1.val >= l2.val) {
                    pre.next = l2;
                    l2 = l2.next;
                } else {
                    pre.next = l1;
                    l1 = l1.next;
                }

                pre = pre.next;
            }

            if (l1 != null) {
                pre.next = l1;
            }

            if (l2 != null) {
                pre.next = l2;
            }

            return head.next;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}