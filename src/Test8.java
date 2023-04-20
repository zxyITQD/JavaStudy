/*
回文数是指正读反读都一样的数字。
  设n是一任意自然数，若将n的各位数字反向排列所得自然数n1与n相等，则称n为一回文数。
  例如，若n=1234321，则称n为一回文数；但若n=1234567，则n不是回文数。
  请编程查找所有的四位数的回文数。
 */
// 1001 1111 1221 1331 1441... 2002 2112 2222 2332 3003 3113
public class Test8 {
    public static void main(String[] args) {
        seachHuiWen();
    }

    // 定义方法
    public static void seachHuiWen() {
        int count = 0;
        for (int i = 1000; i < 10000; i++) {
//            if (i %100 == i%10)
            if(i / 1000 == i % 10 && i % 1000 / 100 == i % 1000 % 100 / 10 ){
                System.out.println(i);
            }
        }

    }
}
