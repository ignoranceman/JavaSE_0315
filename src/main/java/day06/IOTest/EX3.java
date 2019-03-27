package day06.IOTest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class EX3 {
    public static void main(String[] args) {

        Writer writer;
        try {
            writer = new FileWriter("d:/ShiYao/ShiYao.txt", true);
            writer.write("姓名：师尧\n性别：男\n年龄：23\n班级：讯飞AI");
            writer.flush();
            System.out.println("文本写入成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
