package day03.homework;

//基于Map泛型完成10个英文单词的翻译

import java.util.HashMap;
import java.util.Map;

public class E3_35_MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("January", "一月");
        map.put("February", "二月");
        map.put("March", "三月");
        map.put("April", "四月");
        map.put("May", "五月");
        map.put("June", "六月");
        map.put("July", "七月");
        map.put("August", "八月");
        map.put("September", "九月");
        map.put("October", "十月");

        String str = "September";
        if (map.containsKey(str)) {
            System.out.println(map.get(str));
        } else {
            System.out.println("查无此词");
        }
    }
}
