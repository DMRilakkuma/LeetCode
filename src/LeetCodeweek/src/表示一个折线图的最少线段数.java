import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author MC
 * @create 2022-05-22 10:57
 * @Description:
 *给你一个二维整数数组 stockPrices ，其中 stockPrices[i] = [dayi, pricei] 表示股票在 dayi 的价格为 pricei 。折线图 是一个二维平面上的若干个点组成的图，横坐标表示日期，纵坐标表示价格，折线图由相邻的点连接而成。比方说下图是一个例子：
 *
 *
 * 请你返回要表示一个折线图所需要的 最少线段数 。
 *
 *
 *
 * 示例 1：
 *
 *
 *
 * 输入：stockPrices = [[1,7],[2,6],[3,5],[4,4],[5,4],[6,3],[7,2],[8,1]]
 * 输出：3
 * 解释：
 * 上图为输入对应的图，横坐标表示日期，纵坐标表示价格。
 * 以下 3 个线段可以表示折线图：
 * - 线段 1 （红色）从 (1,7) 到 (4,4) ，经过 (1,7) ，(2,6) ，(3,5) 和 (4,4) 。
 * - 线段 2 （蓝色）从 (4,4) 到 (5,4) 。
 * - 线段 3 （绿色）从 (5,4) 到 (8,1) ，经过 (5,4) ，(6,3) ，(7,2) 和 (8,1) 。
 * 可以证明，无法用少于 3 条线段表示这个折线图。
 * 示例 2：
 *
 *
 *
 * 输入：stockPrices = [[3,4],[1,2],[7,8],[2,3]]
 * 输出：1
 * 解释：
 * 如上图所示，折线图可以用一条线段表示。
 *
 *
 * 提示：
 *
 * 1 <= stockPrices.length <= 105
 * stockPrices[i].length == 2
 * 1 <= dayi, pricei <= 109
 * 所有 dayi 互不相同 。
 *
 */
public class 表示一个折线图的最少线段数 {
    public int minimumLines(int[][] stockPrices) {
        if(stockPrices.length == 1){
            return 0 ;
        }
        if(stockPrices.length == 2){
            return 1;
        }
        Arrays.sort(stockPrices, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int r = 2;
        int count = 1;
        while(r < stockPrices.length){
            long k1 = (long) (stockPrices[r][1] - stockPrices[r - 1][1]) * (stockPrices[r-1][0] - stockPrices[r-2][0]);
            long k2 = (long) (stockPrices[r][0] - stockPrices[r - 1][0]) * (stockPrices[r-1][1]-stockPrices[r-2][1]);
            if(k1 != k2){
                count++;
            }
            r++;
        }
        return count;
    }

    @Test
    public void test(){
        int [][] arr = new int [][]{{83,35},{79,51},{61,48},{54,87},{44,93},{22,5},{87,28},
                {64,8},{89,78},{62,83},{58,72},{48,7},{97,16},
                {27,100},{65,48},{11,31},{29,76},{93,29},{72,59},{73,74},{9,90},{66,81},{12,8},
                {86,80},{84,43},{36,63},{80,45},{81,88},{95,5},{40,59}};
        int i = minimumLines(arr);
        System.out.println(i);
    }
}
