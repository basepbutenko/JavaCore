package Threadpool;

import java.awt.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    private BlockingQueue blockingQueue;
    private List<ThreadPoolRunnable> runnables = new ArrayList<>();
    private boolean isStopped=false;
    // create constructor
public ThreadPool(int numOfThread, int maxOfTasks){
blockingQueue=new ArrayBlockingQueue(maxOfTasks);// создаем блокирующую очередь с тем количеством, которое мы получим
    // в конструкторе
    for (int i = 0; i < numOfThread; i++) {
        //create ThreadPoolRunnable
        ThreadPoolRunnable threadPoolRunnable = new ThreadPoolRunnable(blockingQueue);
        // добавляем runnables
        runnables.add(threadPoolRunnable );
        /** в этом случаем мы создаем массив, который будет иметь такое количество потоков,
         * сколько мы передадим в конструктор
         */
    }
    // Теперь нужно запустить каждый из ThreadPoolRunnable для этого запустим forEach цикл, в котором будем перебирать runnable
    for (ThreadPoolRunnable runnable:runnables){
        new Thread(runnable).start();
    }
} // numOfThread - количество потоков/number of threads
    // maxOfTasks - максимальное количество задач, которое может исполнять этот пул потоков
    // создаем public synchronized method он нужен, чтобы принимать runnable и запускать их в наших потоках
    public synchronized void execute (Runnable task){
    if(this.isStopped)
        throw new IllegalStateException("Thread pool is stopped");
    //если же не isStopped , тогда мы добавляем в blockingQueue нашу задачу
        this.blockingQueue.add(task);

    }
    /**
     * Также создаем public synchronized method,that will not return anything. Он будет
     * отвечать за то, чтобы выключить наш пул потоков  и убить все потоки
     */
    public synchronized void stop(){
        this.isStopped=true;
        // вызываем метод doStop
        for (ThreadPoolRunnable runnable:runnables){
            runnable.doStop();
        }
    }
    /**
     * для того, чтобы избежать случая, когда наша задача исполняется
     */
    public synchronized void withUntilAllTasksFinished () throws InterruptedException {
        while (this.blockingQueue.size()>0 ){
            TimeUnit.SECONDS.sleep(1000);
        }
    }
}

// далее создаем класс Main