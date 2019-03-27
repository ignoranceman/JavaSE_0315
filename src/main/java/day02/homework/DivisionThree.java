package day02.homework;

public class DivisionThree {
    //1000-2000内可以整除3的数
    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }
    }
}
