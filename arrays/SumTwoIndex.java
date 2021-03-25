package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhongyang MA
 * @date Mar/25/2021
 * @description 给出一个整数数组，请在数组中找出两个加起来等于目标值的数.
 * 你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），需要满足 index1 小于index2.
 */
public class SumTwoIndex {

    public static int[] twoSum(int[] numbers, int target) {
        // write code here
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            if(map.get(target - numbers[i]) != null) {
                result[0] = map.get(target - numbers[i]) + 1;
                result[1] = i + 1;
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        //
        int[] arr1 = {3,2,4};
        int t = 6;
        System.out.print(twoSum(arr1, t)[0] + ", ");
        System.out.print(twoSum(arr1, t)[1]);
    }

}
