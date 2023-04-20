package com.xiaoyan.study;
/*
故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
  在他的一部著作中提出了一个有趣的问题：
  假设一对刚出生的小兔一个月后就能长成大兔，
  再过一个月就能生下一对小兔，
  并且此后每个月都生一对小兔，
  一年内没有发生死亡。
  问：一对刚出生的兔子，一年内繁殖成多少对兔子?
  1 0
  2 1
  3 1
  4 2
  5 2
  6 4
  当月数大于2时 当月繁殖的兔子是前一个月和前两个月之和
 */
public class Rabbit {
    public static void main(String[] args) {
        int result = feibo(12);
        System.out.println(result);
    }
    public static int feibo(int x){
        if(x == 1){
            return 0;
        }
        if(x == 2){
            return 1;
        }
        return feibo(x-1) + feibo(x-2);
    }
}
