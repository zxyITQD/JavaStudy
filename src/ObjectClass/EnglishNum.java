package ObjectClass;

import java.util.Scanner;

// 键盘录入文本，统计英文字母都多少个
public class EnglishNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入文本:");
        String st = s.nextLine();
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if((ch >='a' && ch <= 'z') || (ch >='A' && ch <= 'Z')){
                count++;
            }
        }
        System.out.println(count);
    }
}
