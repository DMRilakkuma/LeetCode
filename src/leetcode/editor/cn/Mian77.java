package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 * <p>
 * 你可以按 任何顺序 返回答案。
 * <p>
 * 输入：n = 4, k = 2
 * 输出：
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 *
 * @author shkstart
 * @create 2022-04-03 18:30
 */
public class Mian77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        recursion(1, n, k, ans, new ArrayList<>());
        return ans;


    }

    public void recursion(int start, int n, int k, List<List<Integer>> ans, List<Integer> list) {

        if (k == 0) {
            ans.add(new ArrayList<>(list));
            return;

        }

        for (int i = start; i <= n - k + 1; i++) {
            list.add(i);
            recursion(i+1,n,k-1,ans,list);
            list.remove(list.size()-1);
        }


    }
}





