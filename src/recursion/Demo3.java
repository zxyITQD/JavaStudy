package recursion;

/*
有一个5*5方格 小老鼠从左上角第一个方格走到右下角最后一个方格 有多少种最优路线
*/
/*
分析
当小老鼠走到一个方格 它只有往右边或下边才是最优路线 走到最右边或者最下边最优路线只有1条
递归的思想 求它走右边格子的最优路线和下方格子的最优路线之和
 */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println(test(1,1));
    }

    // 定义方法
    public static int test(int x, int y) {
        // 走到最后一个格子停下来
        if (x == 5 || y == 5) {
            return 1;
        }
        return test(x + 1, y) + test(x, y + 1);
    }
}
