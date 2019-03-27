package day06.IOHomework;

import java.io.File;

public class Practise2 {
    public static void main(String[] args) {

        File f1 = new File("d:/wukaiping/wukaiping.txt");

        System.out.println("是否可读："+f1.canRead());
        System.out.println("是否可写："+f1.canWrite());
        System.out.println("能否被删除："+f1.delete());;
        System.out.println("绝对路径："+f1.getAbsolutePath());
        System.out.println("相对路径："+f1.getName());
        System.out.println("父级目录："+f1.getParent());
        System.out.println("总计空间："+f1.getTotalSpace()/1024/1024/1024);
        System.out.println("可用空间："+f1.getUsableSpace()/1024/1024/1024);
    }
}
