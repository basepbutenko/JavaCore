package Lesson1.Thread;

public class SimpleThread {
    public static void main(String[] args) {
        System.out.println("Thread main starts work");
        Runnable runnable = () -> {
            System.out.println("I will work in the thread %s 1 sec\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread has been interrupted");
        };
        Thread thread=new Thread(runnable);
        thread.start();

        System.out.println("Thread main finished work");

}}
