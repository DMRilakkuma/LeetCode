package leetcode.editor.cn;

import java.util.ArrayList;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 解释："amanaplanacanalpanama" 是回文串
 * <p>
 * 输入: "race a car"
 * 输出: false
 * 解释："raceacar" 不是回文串
 *
 * @author shkstart
 * @create 2022-04-14 10:56
 */
public class 验证回文串 {
    public boolean isPalindrome(String s) {

        if (s.equals(" ")) {
            return true;
        }
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                list.add(s.charAt(i));
            }

        }

        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            char c1 = Character.toLowerCase(list.get(left));
            char c2 = Character.toLowerCase(list.get(right));;

            if(c1 != c2){
                return false;
            }
            left++;
            right--;
        }

        return true;


    }

}
