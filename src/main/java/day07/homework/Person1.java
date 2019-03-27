package day07.homework;

public class Person1 extends Thread {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.start();
    }

    public void run() {
        System.out.println(this.getName() + "," + this.getId());

        for (int i = 0; i < 100; i++) {
            System.out.println("做弹弓打你家玻璃！");
        }
        System.out.println("弹弓Over！");
    }

}

