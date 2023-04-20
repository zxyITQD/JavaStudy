import java.util.Scanner;
/*某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
        ​存期		年利率（%）
       ​	一年		2.25
        ​两年		2.7
       ​	三年		3.25
       ​	五年		3.6
       请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
       提示：
        ​	存入金额和存入年限均由键盘录入；
       ​	本息计算方式：本金+本金×年利率×时间
*/
public class Test7 {
    public static void main(String[] args) {
        double totalMoney = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入存款金额：（1000起步）");
        double money = in.nextDouble();
        System.out.println("请输入存款年限：");
        int year = in.nextInt();
        if(year == 1){
            totalMoney = money + money * 0.0225 * year;
            System.out.println("您的本息为：" + totalMoney);
        } else if(year == 2){
            totalMoney = money + money * 0.027 * year;
            System.out.println("您的本息为：" + totalMoney);
        } else if(year == 3){
            totalMoney = money + money * 0.0325 * year;
            System.out.println("您的本息为：" + totalMoney);
        } else if(year == 5){
            totalMoney = money + money * 0.036 * year;
            System.out.println("您的本息为：" + totalMoney);
        } else {
            System.out.println("您输入的数据不合法！");
        }
    }
}
