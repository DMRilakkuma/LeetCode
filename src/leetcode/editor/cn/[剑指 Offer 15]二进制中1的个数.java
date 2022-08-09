package leetcode.editor.cn;

class ErJinZhiZhong1deGeShuLcof {
    public static void main(String[] args) {
        Solution solution = new ErJinZhiZhong1deGeShuLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            n = Integer.parseInt(Integer.toUnsignedString(n));
            int count = 0;
            while (n >= 2) {
                n = n >> 1;
                count++;
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}