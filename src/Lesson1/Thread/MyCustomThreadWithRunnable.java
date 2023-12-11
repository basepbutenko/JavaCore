package Lesson1.Thread;

public class MyCustomThreadWithRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("I will work in the thread %s 1 sec\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread has been interrupted");

        System.out.println("Thread finished");
    }


}

    