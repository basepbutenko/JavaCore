package Threadpool;

public class Main {
    public static void main(String[] args) throws InterruptedException {
         ThreadPool threadPool = new ThreadPool(2 , 15);// количество 10 задач можем
        // запустить в 3 потоках
        for (int i = 0; i < 15; i++) {
            int taskNumber = i;
            /**
             * создаем лямбду и будем выводить название потока, в котором исполняется эта задача
             */
            threadPool.execute(()->{
                System.out.println(Thread.currentThread().getName()+ " Task:"+taskNumber);

            });

        }
        threadPool.withUntilAllTasksFinished();
        threadPool.stop();
    }
}
