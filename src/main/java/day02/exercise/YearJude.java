package day02.exercise;

import java.util.Scanner;

public class YearJude {

    private int year;

    public YearJude() {
        System.out.println("请输入一个年份：");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        boolean result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (result == false) {
            System.out.println(year+"年不是闰年");
        }else{
            System.out.println(year+"年是闰年");
        }
    }

    public static void main(String[] args) {
        YearJude yearJude = new YearJude();
    }
}
