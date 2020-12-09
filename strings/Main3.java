package strings;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/09/2020
 */
public class Main3 {
    public static void main(String[] args) {
        char ch = '\0';
        System.out.println(ch);
        StringBuffer sb = new StringBuffer();
        sb.append("start");
        sb.append(ch);
        sb.append("end");
        String str = sb.toString();
        System.out.println(str);
        char[] charArr = str.toCharArray();
        for(char item : charArr) {
            System.out.println(item);
        }
    }
}
