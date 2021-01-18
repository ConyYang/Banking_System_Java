package Mutithreading.RunnableInterface;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample());
        thread1.setName("1st Thread");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 1;
                while (i<=100){
                    System.out.println(i + " " + Thread.currentThread().getName());
                    i++;
                }// end while loop
            }// end run
        }//runnable
        );//Thread
        thread2.setName("2nd Thread");

        thread2.start();
    }
}
