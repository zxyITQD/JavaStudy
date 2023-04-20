package Regex;

// 正则表达式
public class Demo1 {
    public static void main(String[] args) {
        String s= "他ma的，cao你妈,你个狗东西";
        String regex = "[ma]*[cao]*草{0,}操{0,}[bi]*狗{0,}[gou]*";
        String test = s.replaceAll(regex,"*");
        System.out.println(test);
    }
}
