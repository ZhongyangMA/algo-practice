package strings;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/08/2020
 * 找出字符串中的最大数字串
 */
public class Main1 {

    public static String maxNumStr(String str) {
        if(str == null || str.length() == 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();

        boolean dot = false;
        char currentChar = '\0';
        for(char ch : str.toCharArray()) {
            if((ch >= '0' && ch <= '9')
                    && (currentChar == '\0' || currentChar == '+' || currentChar == '-')) {
                sb.append(ch);
                currentChar = ch;
            } else {
                sb.append(" ");
            }
        }
        String str1 = sb.toString();

        // 按空格切割
        String[] nums = str1.split("\\s+");
        int maxSize = 0;
        for(int i=0; i < nums.length; i++) {
            maxSize = nums[i].length() > maxSize ? nums[i].length() : maxSize;
        }

        //
        String result = "";

        for(int i=0; i < nums.length; i++) {
            if(maxSize == nums[i].length()) {
                result = nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //String input = "1234567890abcd9.+12345.678.9ed";
        String output = maxNumStr(input);
        System.out.println(output);
    }

}
