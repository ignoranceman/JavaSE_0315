package day06.IOTest;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EX1 {

    private static String path;

    public static void main(String[] args) throws IOException {
        createFiledir();
        creatFile();
    }

    public static void createFiledir() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要新建的文件夹名称:");
        path = sc.nextLine();
//        path = "d:/ShiYao";
        File filedir = new File(path);
        if (!filedir.exists()) {
            filedir.mkdirs();
            System.out.println("文件夹创建成功！");
        } else {
            System.out.println("文件夹已存在！");
        }
    }

    private static void creatFile() throws IOException {
        String fileName = "ShiYao.txt";
        File file = new File("d:/ShiYao", fileName);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("文件创建成功");
        } else {
            System.out.println("文件已存在！");
        }
    }

}
