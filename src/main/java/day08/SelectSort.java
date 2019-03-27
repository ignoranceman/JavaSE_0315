package day08;

import java.util.Arrays;

public class SelectSort {

    private static int[] ints = new int[10];

    public static void main(String[] args) {
        RandomNumber();
        System.out.println("选择排序初始序列：" + Arrays.toString(ints));
        SelectSort();
        System.out.println("最终序列（从小到大）：" + Arrays.toString(ints));
    }

    private static void RandomNumber() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100);
        }
    }

    private static void SelectSort() {
        for (int i = 0; i < ints.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[j] < ints[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = ints[min];
                ints[min] = ints[i];
                ints[i] = temp;
            }
            System.out.println("选择排序第" + (i + 1) + "次序列：" + Arrays.toString(ints));
        }
    }
}
