package day05.homework;

import java.io.FileReader;
import java.io.Reader;

public class CountTest<count> {
    public static void main(String[] args) throws Exception {
        System.out.println(countWords("D:/123.txt", "1"));
    }
    public static int countWords(String file, String find) throws Exception {
        int count = 0;
        Reader in = new FileReader(file);
        int c;
        while ((c = in.read()) != -1) {
            while (c == find.charAt(0)) {
                for (int i = 1; i < find.length(); i++) {
                    c = in.read();
                    if (c != find.charAt(i)) {
                        break;
                    }
                    if (i == find.length() - 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
