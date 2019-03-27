package day02.exercise;

import java.util.Scanner;

public class Cube {
    private double length;
    private double width;
    private double height;
    Scanner sc = new Scanner(System.in);

    public void Volume() {
        System.out.println("请输入立方体的长：");
        this.length = sc.nextDouble();
        System.out.println("请输入立方体的宽：");
        this.width = sc.nextDouble();
        System.out.println("请输入立方体的高：");
        this.height = sc.nextDouble();
        double volume = length * width * height;
        System.out.println("立方体的体积是：" + volume);
    }

    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.Volume();
    }
}
