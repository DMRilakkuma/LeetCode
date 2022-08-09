import org.junit.Test;

import java.util.Arrays;

/**
 * @author MC
 * @create 2022-05-14 23:07
 * @Description: 给你一个二维整数数组 tiles ，其中 tiles[i] = [li, ri] ，表示所有在 li <= j <= ri 之间的每个瓷砖位置 j 都被涂成了白色。
 * <p>
 * 同时给你一个整数 carpetLen ，表示可以放在 任何位置 的一块毯子。
 * <p>
 * 请你返回使用这块毯子，最多 可以盖住多少块瓷砖。
 * <p>
 * 输入：tiles = [[1,5],[10,11],[12,18],[20,25],[30,32]], carpetLen = 10
 * 输出：9
 * 解释：将毯子从瓷砖 10 开始放置。
 * 总共覆盖 9 块瓷砖，所以返回 9 。
 * 注意可能有其他方案也可以覆盖 9 块瓷砖。
 * 可以看出，瓷砖无法覆盖超过 9 块瓷砖。
 * <p>
 * <p>
 * 输入：tiles = [[10,11],[1,1]], carpetLen = 2
 * 输出：2
 * 解释：将毯子从瓷砖 10 开始放置。
 * 总共覆盖 2 块瓷砖，所以我们返回 2 。
 */
public class 毯子覆盖的最多白色砖块数 {

    @Test
    public void test() {
        int[][] tiles = new int[][]{{1, 5}, {10, 11}, {12, 18}, {20, 25}, {30, 32}};
        int max = maximumWhiteTiles(tiles, 10);
        System.out.println(max);
    }

    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        Arrays.sort(tiles, (o1, o2) -> o1[0] - o2[0]);
        int n = tiles.length;
        int l = 0;
        int r = 0;
        int sum = 0;
        int max = 0;
        while (r < n) {
            int leftValue = tiles[l][0];
            int rightValue = leftValue + carpetLen - 1;
            while (r < n && tiles[r][1] <= rightValue) {
                sum += tiles[r][1] - tiles[r][0] + 1;
                r++;
                max = Math.max(sum, max);
            }
            if (r < n && tiles[r][1] > rightValue) {
                max = Math.max(max, sum + rightValue - tiles[r][0] + 1);
                sum -= tiles[l][1] - tiles[l][0] + 1;
                l++;
            }
        }
        return max;

    }
}

