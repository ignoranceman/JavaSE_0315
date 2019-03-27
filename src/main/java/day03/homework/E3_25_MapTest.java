package day03.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E3_25_MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 89);
        map.put("李四", 98);
        map.put("王五", 65);
        map.put("赵六", 56);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
