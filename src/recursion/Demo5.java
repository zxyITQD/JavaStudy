package recursion;

/**
 * 斐波那契数列 1 1 2 3 5 8 13 21 ...从第3项开始该项的值为前两项之和
 */
public class Demo5 {
    public static void main(String[] args) {
        System.out.println(feiBo(20));
    }
    // 定义方法
    public static int feiBo(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        return feiBo(n-1) + feiBo(n-2);
    }
}
