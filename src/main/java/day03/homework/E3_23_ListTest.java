package day03.homework;

import java.util.ArrayList;
import java.util.List;

//创建和迭代一个List
public class E3_23_ListTest {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Black");
        names.add("Andy");
        names.add("Lee");
        for (int i = 0; i <names.size() ; i++) {
            String str= names.get(i);
            System.out.println(str);
        }
    }
}
