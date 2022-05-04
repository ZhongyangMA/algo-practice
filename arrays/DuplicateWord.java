package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhongyang MA
 * @date 05/04/2022
 * @description 字符串数组 找出第5个已出现至少2次的字符串
 */
public class DuplicateWord {

    public static void main(String[] args) {
        String[] arr1 = {"ab", "adf", "1245", "ccc", "ab", "ab", "adf", "1245", "7788", "hhh", "7788", "hhh"};
        System.out.println(findFifthDuplicate(arr1));
        String[] arr2 = {"ag", "bh", "cde", "dpd", "ei", "ei", "dpd", "cde", "bh", "ag", "fff"};
        System.out.println(findFifthDuplicate(arr2));
    }

    private static String findFifthDuplicate(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        Integer index = 0;
        String result = "";
        for(String item : arr) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
            //
            if (map.get(item) == 2) {
                index += 1;
            }
            if (index == 5) {
                result = item;
                break;
            }
        }
        return result;
    }

}
