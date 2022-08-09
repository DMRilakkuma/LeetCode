package leetcode.editor.cn;

/**
 * @author MC
 * @create 2022-04-20 20:07
 * @Description: 最长公共前缀
 * <p>
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1：
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 */
public class Main14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String ans = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < ans.length() && j < strs[i].length()) {
                if (!(ans.charAt(j) == strs[i].charAt(j))) {
                    break;
                }
                j++;
            }
            ans = strs[i].substring(0, j);
        }
        return ans;
    }

}
