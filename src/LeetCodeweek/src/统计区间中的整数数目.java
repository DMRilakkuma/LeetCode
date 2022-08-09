import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author MC
 * @create 2022-05-15 11:34
 * @Description: 给你区间的 空 集，请你设计并实现满足要求的数据结构：
 * <p>
 * 新增：添加一个区间到这个区间集合中。
 * 统计：计算出现在 至少一个 区间中的整数个数。
 * 实现 CountIntervals 类：
 * <p>
 * CountIntervals() 使用区间的空集初始化对象
 * void add(int left, int right) 添加区间 [left, right] 到区间集合之中。
 * int count() 返回出现在 至少一个 区间中的整数个数。
 * 注意：区间 [left, right] 表示满足 left <= x <= right 的所有整数 x 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入
 * ["CountIntervals", "add", "add", "count", "add", "count"]
 * [[], [2, 3], [7, 10], [], [5, 8], []]
 * 输出
 * [null, null, null, 6, null, 8]
 * <p>
 * 解释
 * CountIntervals countIntervals = new CountIntervals(); // 用一个区间空集初始化对象
 * countIntervals.add(2, 3);  // 将 [2, 3] 添加到区间集合中
 * countIntervals.add(7, 10); // 将 [7, 10] 添加到区间集合中
 * countIntervals.count();    // 返回 6
 * // 整数 2 和 3 出现在区间 [2, 3] 中
 * // 整数 7、8、9、10 出现在区间 [7, 10] 中
 * countIntervals.add(5, 8);  // 将 [5, 8] 添加到区间集合中
 * countIntervals.count();    // 返回 8
 * // 整数 2 和 3 出现在区间 [2, 3] 中
 * // 整数 5 和 6 出现在区间 [5, 8] 中
 * // 整数 7 和 8 出现在区间 [5, 8] 和区间 [7, 10] 中
 * // 整数 9 和 10 出现在区间 [7, 10] 中
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= left <= right <= 109
 * 最多调用  add 和 count 方法 总计 105 次
 * 调用 count 方法至少一次
 */
public class 统计区间中的整数数目 {
    List<int[]> list;
    TreeSet<Integer> set;


    class CountIntervals {

        public CountIntervals() {
            list = new ArrayList<>();
            set = new TreeSet<>();
        }

        public void add(int left, int right) {
            list.add(new int[]{left, right});
            for (int i = left; i <= right; i++) {
                set.add(i);
            }
        }

        public int count() {
            int count = 0;
            for (int i = set.first(); i <= set.last(); i++) {
                if (set.contains(i)) {
                    count++;
                }
            }
            return count;
        }
    }

    @Test
    public void test() {
        CountIntervals val = new CountIntervals();
        val.add(2, 3);
        val.add(7, 8);
        int count = val.count();
        System.out.println(count);
        val.add(5, 8);
        int count1 = val.count();
        System.out.println(count1);
    }
}
