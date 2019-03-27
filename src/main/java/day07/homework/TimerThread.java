package day07.homework;

public class TimerThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world");
            try {
                sleep(1000 * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TimerThread timerThread = new TimerThread();
        timerThread.start();
    }
}
