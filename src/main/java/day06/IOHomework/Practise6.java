package day06.IOHomework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practise6 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("c:/wukaiping/wukaiping.txt");
        FileWriter fileWriter = new FileWriter("d:/wukaiping.txt");
        int i;
        if ((i = fileReader.read()) != -1) {
            fileWriter.write(i);
            System.out.println("复制成功");
        }
    }
}
