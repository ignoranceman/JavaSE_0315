package day03.homework;

import java.util.ArrayList;
import java.util.List;

public class E3_34_ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("c");
        list.add("b");
        list.add("b");
        list.add("a");
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        System.out.println(list);
    }
}
