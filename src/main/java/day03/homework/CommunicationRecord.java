package day03.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommunicationRecord {
    private int size = 0;
    private List<Record> list = new ArrayList<Record>();

    public CommunicationRecord() {

    }

    public int getSize() {
        return size;
    }

    public void add(Record r) {
        if (r != null) {
            list.add(r);
            Collections.sort(list);
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        CommunicationRecord c = new CommunicationRecord();
        c.add(new Record("张三", "111"));
        c.add(new Record("李四", "222"));
        c.add(new Record("王五", "333"));
        c.add(new Record("赵六", "444"));
        System.out.println(c);
    }
}
