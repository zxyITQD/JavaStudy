package loop;
// 99乘法表
// 1*1=1
// 1*2=2 2*2=4
// 1*3=3 2*3=6 3*3=9

// 每一行是一个循环 每一列也是一个循环
// 第二个乘数为行数 第一个乘数为1到行数 列数与行数相同
public class Demo5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                // 列数不换行
                System.out.print(j + "*" + i + "=" + (i*j) + "\t");// tab长度
            }
            // 行数换行
            System.out.println();
        }
    }
}
