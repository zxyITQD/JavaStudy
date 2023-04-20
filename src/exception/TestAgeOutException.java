package exception;

import java.util.Scanner;

public class TestAgeOutException {
    public static void main(String[] args) {
        /*
        键盘输入名字和年龄 如果年龄输错打印错误信息 并重新输入
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = sc.nextLine();
        Student s = new Student();
        s.setName(name);
       while (true){
           try {
               System.out.println("请输入年龄：");
               // 避免使用 nextInt() nextInt()和nextLine()一起使用可能会出问题
               String ageStr = sc.nextLine();
               // String类型转int类型
               // 可能会发生数字格式异常
               int age = Integer.parseInt(ageStr);

               s.setAge(age);
               // age设置成功 退出循环
               break;
           } catch (NumberFormatException e) { // 数字格式异常
               System.out.println("请输入一个整数");
               e.printStackTrace();
           } catch (AgeOutRoundsException e){ // 自定义异常
               System.out.println("请输入符合年龄范围的值");
               e.printStackTrace();
           }
       }
        System.out.println(s);
    }
}
