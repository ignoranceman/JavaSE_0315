package day02.homework;

import java.util.Scanner;

public class Factorial {
    //阶乘运算
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        int i = 1, s = 1;
        if (n < 1) {
            System.out.println("无法进行阶乘运算");
        } else {
            for (i = 1; i <= n; i++) {
                s *= i;
            }
            System.out.println(n + "的阶乘是" + s);
        }

    }

}
