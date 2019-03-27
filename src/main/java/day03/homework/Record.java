package day03.homework;

import java.text.Collator;
import java.util.Locale;

public class Record implements Comparable<Record> {
    private int id;
    private String name;
    private String phone;

    public Record() {

    }

    public Record(String anme, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + ":" + phone + " ";
    }

    @Override
    public int compareTo(Record o) {
        return Collator.getInstance(Locale.CHINESE).compare(this.name, o.getName());
    }
}

