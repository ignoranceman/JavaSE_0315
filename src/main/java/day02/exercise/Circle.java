package day02.exercise;

import java.util.Scanner;

public class Circle {
    public static double PI = 3.1415926;

    public void area() {
        System.out.println("请输入圆的半径：");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = radius * radius * PI;
        System.out.println("圆的面积是" + area);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();
    }
}
