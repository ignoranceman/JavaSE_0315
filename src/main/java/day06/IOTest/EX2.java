package day06.IOTest;

import java.io.File;

public class EX2 {
    public static void main(String[] args) {

        File file = new File("d:/ShiYao/ShiYao.txt");

        System.out.println("是否可读："+file.canRead());
        System.out.println("是否可写："+file.canWrite());
        System.out.println("能否被删除："+file.delete());;
        System.out.println("绝对路径："+file.getAbsolutePath());
        System.out.println("相对路径："+file.getName());
        System.out.println("父级目录："+file.getParent());
        System.out.println("总计空间："+file.getTotalSpace()/1024/1024/1024);
        System.out.println("可用空间："+file.getUsableSpace()/1024/1024/1024);
    }
}
