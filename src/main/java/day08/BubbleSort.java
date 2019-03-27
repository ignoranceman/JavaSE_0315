package day08;

import java.util.Arrays;

public class BubbleSort {

    private static int[] ints = new int[10];

    public static void main(String[] args) {
        RandomNumber();
        System.out.println("冒泡排序初始序列：" + Arrays.toString(ints));
        BubbleSort();
        System.out.println("最终序列（从小到大）：" + Arrays.toString(ints));
    }

    private static void RandomNumber() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100);
        }
    }

    private static void BubbleSort() {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j + 1] < ints[j]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;

                }
            }
            System.out.println("冒泡排序第" + (i + 1) + "次序列：" + Arrays.toString(ints));
        }
    }
}