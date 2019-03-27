package day08;

import java.util.Arrays;

public class InsertSort {
    private static int[] ints = new int[10];

    public static void main(String[] args) {
        RandomNumber();
        System.out.println("插入排序初始序列：" + Arrays.toString(ints));
        InsertSort();
        System.out.println("最终序列（从小到大）：" + Arrays.toString(ints));
    }

    private static void RandomNumber() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100);
        }
    }

    private static void InsertSort() {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (ints[j - 1] <= ints[j])
                    break;
                int temp = ints[j];
                ints[j] = ints[j - 1];
                ints[j - 1] = temp;
            }
            System.out.println("插入排序第" + (i + 1) + "次序列：" + Arrays.toString(ints));
        }
    }
}
