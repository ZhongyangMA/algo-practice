package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhongyang MA
 * @date Mar/25/2021
 * @description 给定一个数组arr，返回arr的最长无的重复子串的长度(所有数字都不相同)。
 */
public class LongestNonRepeatSub {

    // 最长不重复子串
    public static int maxLength (int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int start = 0, end = 0;
        int maxLen = 1;
        while(end < arr.length) {
            if(map.containsKey(arr[end])) {
                // 此处必须取max，因为map.get(arr[end])+1有可能在start之前
                // 应该取最右一个作为新的start起点
                start = Math.max(start, map.get(arr[end]) + 1);
            }
            map.put(arr[end], end);
            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5};
        int[] arr2 = {2,2,3,4,3};
        System.out.println(maxLength(arr1));
        System.out.println(maxLength(arr2));
    }

}
