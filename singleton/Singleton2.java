package singleton;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/03/2020
 */
public class Singleton2 {
    private static Singleton2 sin;

    private Singleton2() {}

    public static synchronized Singleton2 getInstance() {
        if (sin == null) {
            sin = new Singleton2();
        }
        return sin;
    }
}
