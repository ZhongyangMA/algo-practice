package arrays;

/**
 * @author Zhongyang MA
 * @date Mar/25/2021
 * @description 给定一个数组arr，返回子数组的最大累加和.
 * 例如，arr = [1, -2, 3, 5, -2, 6, -1]，所有子数组中，[3, 5, -2, 6]可以累加出最大的和12，所以返回12.
 */
public class MaxSumOfSubArray {

    public static int maxSum(int[] arr) {
        if(arr.length == 0) return 0;
        int sum = arr[0];
        int max = sum;
        for(int i = 1; i < arr.length; i++) {
            sum = sum > 0 ? sum + arr[i] : arr[i];
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 5, -2, 6, -1};
        System.out.println(maxSum(arr));
    }

}
