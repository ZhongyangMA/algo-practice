package arrays;

/**
 * @author Zhongyang MA
 * @date Mar/25/2021
 * @description 一只青蛙一次可以跳上1级台阶，也可以跳上2级.
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法
 */
public class JumpFloor {
    /**
     * f(n) = f(n-1) + f(n-2)
     * f(1) = 1
     * f(2) = 2
     */
    public int JumpFloor1(int target) {
        if (target == 1) return 1;
        if (target == 2) return 2;
        return JumpFloor1(target - 1) + JumpFloor1(target - 2);
    }

    /**
     *  a = f(n), b = f(n-1)
     *
     *  f1  f2  f3  ... f(n-2)  f(n-1)  f(n)
     *  b   a
     *          a = a + b
     *      b = a - b
     */
    public int JumpFloor2(int target) {
        if(target == 1) return 1;  // f1
        if(target == 2) return 2;  // f2
        // a=f(n), b=f(n-1)
        int a = 2, b = 1;
        // 从f3开始计算
        for (int i = 2; i < target; i++) {
            a = a + b;
            b = a - b;
        }
        return a;
    }

}
