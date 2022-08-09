package leetcode.editor.cn;

import org.junit.Test;

/**
 * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 *
 * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现。
 * @author shkstart
 * @create 2022-04-15 15:17
 */
public class 反转字符串中的元音字母 {
    public String reverseVowels(String s) {

        String str= "aeiouAEIOU";
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length-1;

        while(left < right){
            String s1 = String.valueOf(c[left]);
            if(str.contains(s1)){
                String s2 = String.valueOf(c[right]);
                if(str.contains(s2)){
                    char temp = c[left];
                    c[left] = c[right];
                    c[right] = temp;
                    left++;
                    right--;
                }else{
                    right--;
                }
            }else {
                left++;
            }
        }

        s = String.valueOf(c);
        return s;


    }

    @Test
    public void test(){
        String s = reverseVowels("hello");
        System.out.println(s);

    }
}
