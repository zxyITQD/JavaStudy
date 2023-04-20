// Math实现判断素数 （查找1000以内所有的素数）
public class Test12 {
    public static void main(String[] args) {
        // 如果不是素数 必定有一个因数小于等于它的正平方根
        boolean b = true;
        for (int i = 2; i <= 1000; i++) {
            int x = (int)Math.sqrt(i);
            for (int j = 2; j <= x; j++) {
                if (i % j == 0) {
                    b = false;
                }
            }
            if(b){
                System.out.println(i);
            }
            b = true;
        }
    }
}
