package leetcode.editor.cn;

class BiaoShiShuZhiDeZiFuChuanLcof {
    public static void main(String[] args) {
        Solution solution = new BiaoShiShuZhiDeZiFuChuanLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isNumber(String s) {
            String digital = "0123456789";

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == 'E' || s.charAt(i) == 'e') {
                    if (s.charAt(i + 1) < '0' || s.charAt(i + 1) > '9') {
                        return false;
                    }
                }
                if (s.charAt(i) == '.') {
                    if ((s.charAt(i - 1) < '0' || s.charAt(i) > '9') && (s.charAt(i + 1) < '0' || s.charAt(i + 1) > '9')) {
                        return false;
                    }
                }

            }
            return false;
        }
//leetcode submit region end(Prohibit modification and deletion)

    }
}