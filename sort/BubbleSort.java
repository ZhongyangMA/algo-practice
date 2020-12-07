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
public class BubbleSort {

    private static void bubbleSort(int[] arr) {
        if(arr == null || arr.length <= 1) {
            return;
        }

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {6, 9, 1, 4, 5, 8, 7, 0, 2, 3};

        System.out.println("Before:" + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After:" + Arrays.toString(arr));
    }
}
