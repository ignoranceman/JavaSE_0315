package day02.exercise;

public class Test {
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.setName("张三");
        student1.setSno(1850210001);
        student1.setScore(98.5);
        System.out.println(student1.getName() + "的学号是：" + student1.getSno() + ",成绩是：" + student1.getScore());
    }
}
