package singleton;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/03/2020
 */
public class Singleton3 {
    private static volatile Singleton3 sin;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (sin == null) {
            synchronized (Singleton3.class) {
                if (sin == null) {
                    sin = new Singleton3();
                }
            }
        }
        return sin;
    }
}
