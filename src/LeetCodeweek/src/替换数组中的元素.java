import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author: MC
 * @Pcakage: PACKAGE_NAME.替换数组中的元素
 * @Date: 2022年06月05日 11:02
 * @Description:给你一个下标从 0 开始的数组 nums ，它包含 n 个 互不相同 的正整数。请你对这个数组执行 m 个操作，在第 i 个操作中，你需要将数字 operations[i][0] 替换成 operations[i][1] 。
 * <p>
 * 题目保证在第 i 个操作中：
 * <p>
 * operations[i][0] 在 nums 中存在。
 * operations[i][1] 在 nums 中不存在。
 * 请你返回执行完所有操作后的数组。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,4,6], operations = [[1,3],[4,7],[6,1]]
 * 输出：[3,2,7,1]
 * 解释：我们对 nums 执行以下操作：
 * - 将数字 1 替换为 3 。nums 变为 [3,2,4,6] 。
 * - 将数字 4 替换为 7 。nums 变为 [3,2,7,6] 。
 * - 将数字 6 替换为 1 。nums 变为 [3,2,7,1] 。
 * 返回最终数组 [3,2,7,1] 。
 * 示例 2：
 * <p>
 * 输入：nums = [1,2], operations = [[1,3],[2,1],[3,2]]
 * 输出：[2,1]
 * 解释：我们对 nums 执行以下操作：
 * - 将数字 1 替换为 3 。nums 变为 [3,2] 。
 * - 将数字 2 替换为 1 。nums 变为 [3,1] 。
 * - 将数字 3 替换为 2 。nums 变为 [2,1] 。
 * 返回最终数组 [2,1] 。
 * <p>
 * <p>
 * 提示：
 * <p>
 * n == nums.length
 * m == operations.length
 * 1 <= n, m <= 105
 * nums 中所有数字 互不相同 。
 * operations[i].length == 2
 * 1 <= nums[i], operations[i][0], operations[i][1] <= 106
 * 在执行第 i 个操作时，operations[i][0] 在 nums 中存在。
 * 在执行第 i 个操作时，operations[i][1] 在 nums 中不存在。
 */
public class 替换数组中的元素 {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int n = nums.length;
        int m = operations.length;
        HashMap<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < n; i++) {
           map.put(nums[i],i);
        }
        for (int i = 0; i < m; i++) {
            int index = map.get(operations[i][0]);
            nums[index] = operations[i][1];
            map.put(operations[i][1],index);
        }
        return nums;
    }


}