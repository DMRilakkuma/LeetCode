/**
 * @author: MC
 * @Pcakage: PACKAGE_NAME.强密码检验器II
 * @Date: 2022年06月11日 22:30
 * @Description:
 * 如果一个密码满足以下所有条件，我们称它是一个 强 密码：
 *
 * 它有至少 8 个字符。
 * 至少包含 一个小写英文 字母。
 * 至少包含 一个大写英文 字母。
 * 至少包含 一个数字 。
 * 至少包含 一个特殊字符 。特殊字符为："!@#$%^&*()-+" 中的一个。
 * 它 不 包含 2 个连续相同的字符（比方说 "aab" 不符合该条件，但是 "aba" 符合该条件）。
 * 给你一个字符串 password ，如果它是一个 强 密码，返回 true，否则返回 false 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：password = "IloveLe3tcode!"
 * 输出：true
 * 解释：密码满足所有的要求，所以我们返回 true 。
 * 示例 2：
 *
 * 输入：password = "Me+You--IsMyDream"
 * 输出：false
 * 解释：密码不包含数字，且包含 2 个连续相同的字符。所以我们返回 false 。
 * 示例 3：
 *
 * 输入：password = "1aB!"
 * 输出：false
 * 解释：密码不符合长度要求。所以我们返回 false 。
 *
 *
 * 提示：
 *
 * 1 <= password.length <= 100
 * password 包含字母，数字和 "!@#$%^&*()-+" 这些特殊字符。
 */
public class 强密码检验器II {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8){
            return false;
        }
        int [] flag = new int[4];
        String s = "!@#$%^&*()-+";
        for (int i = 0; i < password.length(); i++) {
            if(i != 0 && password.charAt(i) == password.charAt(i -1)){
                return false;
            }
            if(Character.isUpperCase(password.charAt(i))){
                flag[0]++;
            }
            if(Character.isLowerCase(password.charAt(i))){
                flag[1]++;
            }
            if(Character.isDigit(password.charAt(i))){
                flag[2]++;
            }
            if(s.indexOf(password.charAt(i)) != -1){
                flag[3]++;
            }
        }
        for (int i = 0; i < 4; i++) {
            if(flag[i] < 1){
                return false;
            }
        }
        return true;


    }
}