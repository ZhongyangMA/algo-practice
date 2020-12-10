package strings;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/08/2020
 * 句子单词倒序输出
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nums = input.split("\\s+|\\+|-|\\*|/");  // 按多种字符分割示例
        StringBuffer sb = new StringBuffer();
        for(int i = nums.length - 1; i >=0; i--) {
            System.out.println(nums[i]);
            sb.append(nums[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}
