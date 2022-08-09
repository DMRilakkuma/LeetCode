package leetcode.editor.cn;

import java.util.Arrays;

class XuanZhuanShuZuDeZuiXiaoShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new XuanZhuanShuZuDeZuiXiaoShuZiLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minArray(int[] numbers) {
            for (int i = 0; i < numbers.length; i++) {
                if(i > 0 && numbers[i]< numbers[i-1]){
                    return numbers[i];
                }
            }
            return  numbers[0];
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}