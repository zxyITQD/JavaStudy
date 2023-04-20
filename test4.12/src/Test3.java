import java.util.Scanner;
import java.util.TreeMap;

/**
 * 请通过键盘录入一段纯英文文本（无需校验数据的正确性，按要求录入即可），统计其中每个英文字符出现的次数，打印结果如下：
 * a=5
 * b=6
 * c=7
 * ...
 * 表示a出现5次，b出现6次，以此类推；要求按照字母的自然顺序输出。
 */
public class Test3 {
    public static void main(String[] args) {
        TreeMap<Character, Integer> t = new TreeMap<>();
        Scanner s = new Scanner(System.in);
        System.out.println("请输入文本：");
        String text = s.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                if(t.containsKey(c)){
                    Integer integer = t.get(c);
                    integer++;
                    t.put(c,integer);
                }else {
                    t.put(c,1);
                }
            }
        }
        t.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });
    }
}
