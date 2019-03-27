package day06.IOTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EX4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\ShiYao\\Practise1.java"));
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            System.out.println(string);
        }
        bufferedReader.close();
    }
}
