package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 * <p>
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * <p>
 * 输入：intervals = [[1,4],[4,5]]
 * 输出：[[1,5]]
 * 解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
 *
 * @author shkstart
 * @create 2022-04-18 16:09
 */
public class 合并区间 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return o1[0] - o2[0];
            }

        });
        ArrayList<int[]> list = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; i++) {
            int L = intervals[i][0];
            int R = intervals[i][1];

            if (list.size() == 0 || list.get(list.size() - 1)[1] < L) {
                list.add(intervals[i]);
            } else {
                list.get(list.size() - 1)[1] = Math.max(R, list.get(list.size() - 1)[1]);
            }
        }

        return list.toArray(new int[list.size()][2]);

    }

}
