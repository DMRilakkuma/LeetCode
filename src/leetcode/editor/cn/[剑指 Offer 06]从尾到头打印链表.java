package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

class CongWeiDaoTouDaYinLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new CongWeiDaoTouDaYinLianBiaoLcof().new Solution();

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
        public int[] reversePrint(ListNode head) {
            Deque<Integer> path = new ArrayDeque<>();
            ListNode cur = head;
            while (cur != null) {
                path.addFirst(cur.val);
                cur = cur.next;
            }
            int[] arr = new int[path.size()];
            int index = 0;
            while (path.size() > 0) {
                arr[index++] = path.pollFirst();
            }
            return arr;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}