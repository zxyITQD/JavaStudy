public class Test6 {
    static{
        int x=3;
    }


    public static void main(String[] args) {
        int x = 0;
        x++;
        test(x);
        System.out.println("x:"+x + " "+"y:"+test(x));

    }
    public static int test(int x){
        int y = 0;
      return   y = --x + x++;
    }
}
