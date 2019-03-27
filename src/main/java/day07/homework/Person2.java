package day07.homework;

public class Person2 implements Runnable {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        Thread thread = new Thread(person2);
        thread.start();
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "," + Thread.currentThread().getId());
        for (int i = 0; i < 100; i++) {
            System.out.println("做弹弓打你家玻璃!");
        }
        System.out.println("弹弓over!");
    }

}
