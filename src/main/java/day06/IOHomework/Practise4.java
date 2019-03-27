package day06.IOHomework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practise4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\wukaiping\\wukaiping.java"));
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            System.out.println(string);
        }
        bufferedReader.close();
    }
}
