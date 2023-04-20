package recursion;

// 阶乘
// 递归思想 把复杂的问题 分成多个简单的问题 解决简单的问题 反过来推复杂的问题

// 求6的阶乘
/*
6！= 6*5！ 5！= 5*4！...
 */
public class Demo1 {
    public static void main(String[] args) {
        int n = 6;
        int jc = jc(n);
        System.out.println(jc);
    }

    // 定义方法
    public static int jc(int n) {
        // 出口
        if (n == 1) {
            return 1;
        }
        return jc(n - 1) * n;
    }
}
