package leetcode.editor.cn;

import java.util.ArrayList;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串
 *
 * @author shkstart
 * @create 2022-03-26 21:25
 */
public class Main3 {
    public static int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        int max = 0;
        ArrayList list = new ArrayList();
        for (int i = 0; i < c.length; i++) {
            if(list.contains(c[i])) {
                char same = c[i];
                int size = list.size();
                for (int j = 0; j < size; j++) {
                    if(list.get(j).equals(same)){
                        list.remove(list.get(j));

                        break;
                    }
                    list.remove(list.get(j));

                    j--;
                }


            }
            list.add(c[i]);
            if(list.size() > max){
                max = list.size();
            }

        }
        if(list.size() > max){
            max = list.size();
        }

        return max;


    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
