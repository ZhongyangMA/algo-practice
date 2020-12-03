package singleton;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/03/2020
 */
public class Singleton1 {
    private static Singleton1 sin = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return sin;
    }
}

