package leetcode.editor.cn;

class LianBiaoZhongDaoShuDiKgeJieDianLcof {
    public static void main(String[] args) {
        Solution solution = new LianBiaoZhongDaoShuDiKgeJieDianLcof().new Solution();

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
        public ListNode getKthFromEnd(ListNode head, int k) {

            ListNode pre = head;
            ListNode cur = head;
            while (k > 1) {
                pre = pre.next;
                k--;
            }

            if (pre == null) {
                return null;
            }

            while (pre.next != null) {
                cur = cur.next;
                pre = pre.next;
            }

            return cur;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}