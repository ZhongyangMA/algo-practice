package singleton;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/03/2020
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("XcccX");
        Singleton1 sin1 = Singleton1.getInstance();
        Singleton1 sin2 = Singleton1.getInstance();
        System.out.println(sin1 == sin2);
    }
}
