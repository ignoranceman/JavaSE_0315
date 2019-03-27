package day06.IOHomework;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Practise3 {
    public static void main(String[] args) {
        Writer wr;
        try {
            wr = new FileWriter("d:/wukaiping/wukaiping.txt", true);
            wr.write("姓名：吴凯平\n性别：女\n年龄：21\n班级：讯飞人工智能");
            wr.flush();
            System.out.println("写入成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
