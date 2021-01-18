package Mutithreading.MultiThreadingExample;

public class ThreadExample extends Thread {
    @Override
    public void run(){
        int i = 1;
        while (i<=100){
            System.out.println(i + " " + this.getName());
            i++;
        }// end while loop
    } // end run()
}
