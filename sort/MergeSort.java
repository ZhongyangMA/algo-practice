package sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/11/2020
 */
public class MergeSort {

    // 归并两个有序数组
    public static int[] mergeSort(int[] a, int [] b) {
        int[] c = new int[a.length + b.length];
        //i用于标记数组a
        int i=0;
        //j用于标记数组b
        int j=0;
        //用于标记数组c
        int k=0;

        //a，b数组都有元素时
        while(i<a.length && j<b.length) {
            if(a[i]<b[j]) {
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }

        //若a有剩余
        while(i<a.length) {
            c[k++] = a[i++];
        }

        //若b有剩余
        while(j<b.length) {
            c[k++] = b[j++];
        }

        return c;
    }

    public static void main(String[] args) {

        // 两个有序数组
        int[] a = {1, 4, 5, 6, 9};
        int[] b = {0, 2, 3, 7, 8};

        System.out.println("MergeSort");
        int[] c = mergeSort(a, b);
        System.out.println("After:" + Arrays.toString(c));
    }
}
