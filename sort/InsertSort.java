package sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/07/2020
 *
 * O(n2) stable
 */
public class InsertSort {

    private static void insertSort(int[] arr) {
        // i的左边已排好，i是排好区域的最后一个元素；
        // 检查i+1位置上的元素，用j扫描左边已排好的部分，寻找插入位置。
        for(int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i+1];
            int j = i;
            for(; j >= 0; j--) {
                if(arr[j] < temp) {
                    break;
                }
                arr[j+1] = arr[j];  // element shifts to right
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {6, 9, 1, 4, 5, 8, 7, 0, 2, 3};

        System.out.println("InsertSort");
        System.out.println("Before:" + Arrays.toString(arr));
        insertSort(arr);
        System.out.println("After:" + Arrays.toString(arr));
    }
}
