package day06.IOTest;

import java.io.File;
import java.util.Scanner;

public class EX5 {

    private static String path;

    public static void main(String[] args) {
        System.out.println("请输入您要检索的目录：");
        Scanner sc = new Scanner(System.in);
        path = sc.nextLine();
        findJavaFile(new File(path));
    }

    private static void findJavaFile(File dir) {
        File file = new File(path);
        for (File temp : file.listFiles()) {
            if (temp.isFile() && temp.getName().endsWith(".java")) {
                System.out.println(temp.getAbsolutePath());
            }
        }
    }
}
