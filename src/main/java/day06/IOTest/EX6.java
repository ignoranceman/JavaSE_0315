package day06.IOTest;

import java.io.*;
import java.util.Scanner;

public class EX6 {

    private static String oldPath;
    private static String newPath;

    public static void main(String[] args) throws IOException {
        copyFile();
    }

    public static void copyFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要复制的文件路径及文件名:");
        oldPath = sc.nextLine();
        System.out.println("请输入目标路径及文件名:");
        newPath = sc.nextLine();
        try {
            int byteRead;
            File oldFile = new File(oldPath);
            if (oldFile.exists()) {
                InputStream inStream = new FileInputStream(oldPath);
                FileOutputStream fs = new FileOutputStream(newPath);
                byte[] buffer = new byte[1024];
                while ((byteRead = inStream.read(buffer)) != -1) {
                    System.out.println("文件复制成功");
                    fs.write(buffer, 0, byteRead);
                }
                inStream.close();
            }
        } catch (Exception e) {
            System.out.println("复制文件出错");
            e.printStackTrace();
        }
    }
}
