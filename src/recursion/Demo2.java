package recursion;

// 汉诺塔 6个圆盘从小到大排列到柱子上 另有两个柱子 每次只能挪动一个圆盘 大圆盘不能压在小圆盘上挪动圆盘多少次
/*
1个圆盘挪动1次
2个圆盘挪动3次
3个圆盘挪动7次
n个圆盘挪动2*（n-1）+1次
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println(hanNuo(6));
    }

    // 定义方法
    public static int hanNuo(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return hanNuo(n - 1) * 2 + 1;
    }
}
