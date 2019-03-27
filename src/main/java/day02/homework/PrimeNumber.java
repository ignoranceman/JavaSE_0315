package day02.homework;

import java.util.Scanner;

public class PrimeNumber {
    //判断一个数是否为质数
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();
        if (num > 0) {
            int k = (int) Math.sqrt(num);//k为num的正平方根，取整数
            for (int i = 2; i <= k; i++) {
                if (num % i == 0) {
                    isPrime = false;//不是素数
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + "是质数");
        } else {
            System.out.println(num + "不是质数");
        }
    }
}
