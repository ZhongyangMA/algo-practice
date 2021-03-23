package strings;

import java.util.Arrays;

/**
 * @author Zhongyang MA
 * @date Mar/23/2021
 * @description 最长公共前缀
 */
public class LongestPublicPrefix {

    public static String longestPubPrefix(String[] arr) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        int arrLen = arr.length;
        int m = arr[0].length();
        int n = arr[arrLen-1].length();
        int num = Math.min(m, n);
        for(int i = 0; i < num; i++) {
            if(arr[0].charAt(i) == arr[arrLen-1].charAt(i)) {
                sb.append(arr[0].charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"app", "apple", "application"};
        String res = longestPubPrefix(arr);
        System.out.println(res);
    }

}
