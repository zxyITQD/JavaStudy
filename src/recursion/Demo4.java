package recursion;
/*
一人上台阶 每次可以上一个台阶或者两个台阶 一共20个台阶 他可以有多少种上法
分析
上1台阶1种
上2台阶2种
上3台阶3种
上到20台阶最后一定在18阶或者19阶上去的
问题转化为上到18阶和上到19阶方法数之和
 */

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(go(20));
    }
    // 定义方法
    public static int go(int n){
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return go(n-1)+go(n-2);
    }
}
