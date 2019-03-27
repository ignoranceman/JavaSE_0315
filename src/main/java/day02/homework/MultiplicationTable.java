package day02.homework;

public class MultiplicationTable {
    //九九乘法表
    public static void main(String[] args) {
        int x, y;

        for (x = 0; x <= 9; x++) {
            for (y = 1; y <= x; y++) {
                System.out.print(y + "X" + x + "=" + x * y + "\t");
            }
            System.out.println();
        }
    }
}
