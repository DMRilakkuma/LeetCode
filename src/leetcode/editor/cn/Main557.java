package leetcode.editor.cn;

/**
 * 给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * 示例 1：
 * <p>
 * 输入：s = "Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 * 示例 2:
 * <p>
 * 输入： s = "God Ding"
 * 输出："doG gniD"
 *
 * @author shkstart
 * @create 2022-03-27 16:49
 */
public class Main557 {
    public static String reverseWords(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = left;
        for (int i = 0; i < c.length; i++) {
            if (i +1  < c.length) {
                if (c[i + 1] != ' ' && c[i] !=' ') {

                    right++;
                }
                if (c[i + 1] == ' ') {
                    reverse(c, left, right);

                    left = i+2;
                    right = left;

                }
            }else {
                reverse(c, left, right);
            }


        }
        return String.valueOf(c);
    }

    public static char[] reverse(char[] c, int left, int right) {
        while (left < right) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right--;
        }
        return c;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = reverseWords(s);
        System.out.println(s1);


    }

}
