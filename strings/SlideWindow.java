package strings;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/30/2020
 * 给你两个长度相同的字符串s和t, 将s中的第i个字符变到t中的第i个字符
 * 需要 |s[i] - t[i]| 的开销（开销可能为 0), 也就是两个字符的 ASCII
 * 码值的差的绝对值. 用于变更字符串的最大预算是 maxCost. 在转化字符串时
 * 总开销应当小于等于该预算，这也意味着字符串的转化可能是不完全的.
 * 如果你可以将 s 的子字符串转化为它在 t 中对应的子字符串，
 * 则返回可以转化的最大长度。  如果 s 中没有子字符串可以转化成 t 中对应的子字符串，
 * 则返回 0。
 */
public class SlideWindow {

    public static void main(String[] args) {
        // case 1
        String s1 = "abcd", t1 = "bcdf";
        int cost1 = 3;
        System.out.println(func(s1,t1,cost1));  //out: 3

        // case 2
        String s2 = "abcd", t2 = "cdef";
        int cost2 = 3;
        System.out.println(func(s2,t2,cost2));  //out: 1

        // case 3
        String s3 = "abcd", t3 = "acde";
        int cost3 = 0;
        System.out.println(func(s3,t3,cost3));  //out: 1
    }

    public static int func(String s, String t, int maxCost) {
        int left = 0, right =0;  // 窗口左端、右端
        int sum = 0;             // 绝对值之和
        int res = 0;             // 结果 最大窗口长度
        // 构造窗口
        while (right < s.length()) {
            sum += Math.abs(s.charAt(right) - t.charAt(right));
            right++;  // 窗口右端向右滑动

            // 对每一个右端值 滑动窗口的左端
            while (sum > maxCost) {
                sum -=  Math.abs(s.charAt(left) - t.charAt(left));
                left++;  //左端向右滑动 缩小窗口
            }
            // 记录此时窗口的大小
            res = Math.max(res, right -left);
        }
        return res;
    }

}
