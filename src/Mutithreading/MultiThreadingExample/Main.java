package Mutithreading.MultiThreadingExample;

public class Main {
    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample();
        thread1.setName("First Thread");

        ThreadExample thread2 = new ThreadExample();
        thread2.setName("Second Thread");

        thread1.start();
        thread2.start();
    }
}
