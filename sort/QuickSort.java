package sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/07/2020
 *
 * O(n*logn) unstable
 */
public class QuickSort {
    private static void quickSort(int[] arr, int left, int right) {
        if(left > right) return;
        // 定义基准值为数组第一个元素
        int pivot = arr[left];
        // 赋值滑动指针
        int i = left;
        int j = right;

        while (i<j) {
            while (pivot <= arr[j] && i < j) {
                j--;
            }
            while (arr[i] <= pivot && i < j) {
                i++;
            }
            // 经过上面两个while 搜索出了在基准左比基准大、在基准右边比基准小的两个位置
            // 交换这两个元素
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("i="+i+", j="+j);
        // 此时ij已经碰到一起 把基准值放到这个位置
        arr[left] = arr[i];
        arr[i] = pivot;
        // 递归处理左右两部分
        quickSort(arr, left, i-1);
        quickSort(arr, i+1, right);
    }

    public static void main(String[] args) {

        int[] arr = {6, 9, 4, 1, 5, 8, 7, 0, 2, 3};

        System.out.println("QuickSort");
        System.out.println("Before:" + Arrays.toString(arr));
        quickSort(arr, 0, 9);
        System.out.println("After:" + Arrays.toString(arr));
    }
}
