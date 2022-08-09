package leetcode.editor.cn;

class JianShengZiIiLcof {
    public static void main(String[] args) {
        Solution solution = new JianShengZiIiLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int cuttingRope(int n) {
            int count = 0;
            String s = Integer.toUnsignedString(n,2);
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0'){
                    count++;
                }

            }
            Integer.bitCount(n);
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}