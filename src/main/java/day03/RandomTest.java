package day03;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {
        for (int i = 0; i <= 10000; i++) {
            System.out.println("Math:" + (int) (1 + Math.random() * 20));
        }

        Random ra = new Random();
        for (int i = 0; i <= 10000; i++) {
            System.out.println("Random:" + (ra.nextInt(20)+1));
        }
    }
}