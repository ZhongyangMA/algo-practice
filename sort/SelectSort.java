package sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/07/2020
 *
 * O(n2) unstable
 */
public class SelectSort {

    private static void selectSort(int[] arr) {

        // len-1-i的右边是已排好的范围；j扫描左边找出最大值替换len-1-i位置上的元素
        for(int i = 0; i < arr.length - 1; i++) {
            int pmax = arr.length - 1 - i;
            for(int j = 0; j < pmax; j++) {
                if(arr[j] > arr[pmax]) {
                    int temp = arr[j];
                    arr[j] = arr[pmax];
                    arr[pmax] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {6, 9, 1, 4, 5, 8, 7, 0, 2, 3};

        System.out.println("SelectSort");
        System.out.println("Before:" + Arrays.toString(arr));
        selectSort(arr);
        System.out.println("After:" + Arrays.toString(arr));
    }
}
