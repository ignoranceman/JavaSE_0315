package day06.IOHomework;

import java.io.File;
import java.io.IOException;

public class Practise1 {

    public static void main(String[] args) throws IOException {
        String path = "d:/wukaiping";
        File filedir = new File(path);
        if (!filedir.exists()) {
            filedir.mkdirs();
            System.out.println("新建文件夹成功！");
        }
        String fileName = "wukaiping.txt";
        File file = new File(filedir, fileName);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("新建文档成功");
        }
    }

}
