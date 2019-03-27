package day02.exercise;

public class Human {
    private String name;
    private char gender;
    private int age;
    private double height;

    public Human(String name, char gender, int age, int height) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Human Jerry = new Human();
        Jerry.setName("Jerry");
        Jerry.setGender('m');
        Jerry.setAge(18);
        Jerry.setHeight(1.67);
        System.out.println("姓名:" + Jerry.getName());
        System.out.println("性别:" + Jerry.getGender());
        System.out.println("年龄:" + Jerry.getAge());
        System.out.println("身高:" + Jerry.getHeight());
    }
}
