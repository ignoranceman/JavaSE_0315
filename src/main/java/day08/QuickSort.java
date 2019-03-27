package day08;


import java.util.Arrays;

public class QuickSort {
    private static int[] ints = new int[10];

    public static void main(String[] args) {
        RandomNumber();
        System.out.println("快速排序初始序列：" + Arrays.toString(ints));
        quickSort(ints, 0, ints.length - 1);
        System.out.println("最终序列（从小到大）：" + Arrays.toString(ints));
    }

    private static void RandomNumber() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100);
        }
    }

    public static void quickSort(int[] ints, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        temp = ints[low];

        while (i < j) {
            while (temp <= ints[j] && i < j) {
                j--;
            }
            while (temp >= ints[i] && i < j) {
                i++;
            }
            if (i < j) {
                t = ints[j];
                ints[j] = ints[i];
                ints[i] = t;
            }
            System.out.println("快速排序第" + (i + 1) + "次序列：" + Arrays.toString(ints));
        }
        ints[low] = ints[i];
        ints[i] = temp;
        quickSort(ints, low, j - 1);
        quickSort(ints, j + 1, high);
    }


}
