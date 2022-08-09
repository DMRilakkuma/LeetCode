import org.junit.Test;

/**
 * @author MC
 * @create 2022-05-14 22:33
 * @Description: 示例 1：
 * <p>
 * 输入：num = 240, k = 2
 * 输出：2
 * 解释：以下是 num 里长度为 k 的子字符串：
 * - "240" 中的 "24" ：24 能整除 240 。
 * - "240" 中的 "40" ：40 能整除 240 。
 * 所以，k 美丽值为 2 。
 * 示例 2：
 * <p>
 * 输入：num = 430043, k = 2
 * 输出：2
 * 解释：以下是 num 里长度为 k 的子字符串：
 * - "430043" 中的 "43" ：43 能整除 430043 。
 * - "430043" 中的 "30" ：30 不能整除 430043 。
 * - "430043" 中的 "00" ：0 不能整除 430043 。
 * - "430043" 中的 "04" ：4 不能整除 430043 。
 * - "430043" 中的 "43" ：43 能整除 430043 。
 * 所以，k 美丽值为 2 。
 */
public class 找到一个数字的K美丽值 {
    @Test
    public void test() {
        int num = 430043;
        int k = 2;
        int count = divisorSubstrings(num, k);
        System.out.println(count);
    }

    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int n = s.length();
        if (s.length() < k) {
            return 0;
        }
        int count = 0;
        int left = 0;
        int right = k - 1;
        while (right < n) {
            String substring = s.substring(left, right+1);
            int sum = Integer.parseInt(substring);
            if (sum!= 0 && num % sum == 0) {
                count++;
            }
            left++;
            right++;
        }
        return count;

    }
}
