package strings;

/**
 * @author Zhongyang MA
 * @date Mar/23/2021
 * @description
 */
public class Palindrome {

    // 判断是不是回文串
    public static boolean isPalindrome(String s) {
        int l = s.length();
        for(int i = 0; i < l/2; i++) {
            if(s.charAt(i) != s.charAt(l-i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "bfcfb";
        System.out.println(isPalindrome(s1));  // true
        String s2 = "abba";
        System.out.println(isPalindrome(s2));  // true
        String s3 = "erres";
        System.out.println(isPalindrome(s3));  // false
        String s4 = "accbba";
        System.out.println(isPalindrome(s4));  // false
    }

}
