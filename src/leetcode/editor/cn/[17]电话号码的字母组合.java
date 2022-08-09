package leetcode.editor.cn;

import java.util.*;

class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        Solution solution = new LetterCombinationsOfAPhoneNumber().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> list = new ArrayList<>();
        public List<String> letterCombinations(String digits) {
            int size = digits.length();
            if(size == 0){
                return list;
            }
            String[] strings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            int index = 0;
            StringBuffer sb = new StringBuffer();
            dfs(strings, index, size, digits,sb);
            return list;
        }

        public void dfs(String[] strings, int index, int size, String digits,StringBuffer sb) {

            if (sb.length() == size) {
                list.add(String.valueOf(sb));
                return;
            }
            if (index >= digits.length()) {
                return;
            }
            int n = (int) (digits.charAt(index) - '0');
            for (int i = 0; i < strings[n].length(); i++) {
                sb.append(strings[n].charAt(i));
                dfs(strings,index+1,size,digits,sb);
                sb.deleteCharAt(sb.length()-1);
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}