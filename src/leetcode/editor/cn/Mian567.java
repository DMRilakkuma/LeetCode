package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。
 * <p>
 * 换句话说，s1 的排列之一是 s2 的 子串 。
 * 示例 1：
 * <p>
 * 输入：s1 = "ab" s2 = "eidbaooo"
 * 输出：true
 * 解释：s2 包含 s1 的排列之一 ("ba").
 * 示例 2：
 * <p>
 * 输入：s1= "ab" s2 = "eidboaoo"
 * 输出：false
 *
 * @author shkstart
 * @create 2022-03-29 17:08
 */
public class Mian567 {
    public static boolean checkInclusion(String s1, String s2) {
       int l1 = s1.length();
       int l2 = s2.length();
       int [] c1 = new int[26];
       int [] c2 = new int[26];
       if(l1 > l2){
           return false;
       }
        for (int i = 0; i < l1; i++) {
            c1[s1.charAt(i)-'a']++;
            c2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(c1,c2)){
            return true;
        }

        for(int i = l1 ; i < l2;i++){
            c2[s2.charAt(i-l1) - 'a']--;
            c2[s2.charAt(i)-'a']++;

            if(Arrays.equals(c1,c2)){
                return true;
            }
        }

        return false;

    }




    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbobao";
        boolean b = checkInclusion(s1, s2);
        System.out.println(b);
    }
}
