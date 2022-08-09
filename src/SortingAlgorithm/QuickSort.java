package SortingAlgorithm;

import java.util.Arrays;

/**
 * @author: MC
 * @program: LeetCode
 * @create: 2022-07-11 18:51
 * @Description: 快速排序
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(0, array.length - 1, array);
        System.out.println(Arrays.toString(array));
    }


    public static void quickSort(int begin, int end, int[] array) {
        if (begin >= end) {
            return;
        }

        int left = begin;
        int right = end;
        int key = array[begin];
        while (left < right) {
            while (left < right && array[right] >= key) {
                right--;
            }

            while (left < right && array[left] <= key) {
                left++;
            }

            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }

        array[begin] = array[left];
        array[left] = key;
        quickSort(begin, right - 1, array);
        quickSort(left + 1, end, array);
    }
}