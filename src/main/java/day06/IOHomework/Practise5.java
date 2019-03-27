package day06.IOHomework;

import java.io.File;

public class Practise5 {

    public static void main(String[] args) {
        File file = new File("D:\\wukaiping");
        for (File temp : file.listFiles()) {
            if (temp.isFile() && temp.getName().endsWith(".java")) {
                System.out.println(temp.toString());
            }
        }
    }
}
