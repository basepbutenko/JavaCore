package Threadpool;
//когда имплементируешь интерф Runnable необходимо нажать ctrl+O и переопределить метод из интерфейса

import java.util.concurrent.BlockingQueue;

/**
 * этот класс нам нужен для того, чтобы создавать потоки и хранить их в пуле потоков
 * В Java интерфейс Runnable используется для создания многозадачных программ с использованием
 * многопоточности. Когда класс реализует интерфейс Runnable, он должен предоставить
 * реализацию метода run(). Этот метод содержит код, который будет выполняться в отдельном потоке,
 * когда объект этого класса будет передан в конструктор Thread и поток будет запущен.
 * Вы должны вставить логику, которая должна выполняться параллельно, внутри метода run().
 * Когда поток будет создан и запущен с объектом ThreadPoolRunnable, код в методе run()
 * будет выполняться в этом отдельном потоке. Это позволяет параллельно выполнять задачи
 * в многозадачном режиме, улучшая производительность в некоторых случаях.
 * ЧТО МЫ СДЕЛАЛИ: мы создали поток, в котором будут исполняться наши задачи , задачи будут поступать
 *  через конструктор и записываться в очередь ; В цикле они будут проверяться если поток еще жив , будут
 *  браться с очереди задачи, переводиться к типу Runnable и запускаться с помощью метода run  ,
 *  Cледующее создаем класс ThreadPool
 */
public class ThreadPoolRunnable implements Runnable {
    private Thread thread = null;
    private BlockingQueue blockingQueue;
    private boolean isStopped = false;

    /**
     * 2 создаем конструктор для создания очереди задач, которые будут назначаться этому
     * потоку на исполнение
     *
     * @param blockingQueue
     */
    public ThreadPoolRunnable(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        //4. реализуем метод run
        this.thread=Thread.currentThread();
        // в цикле while мы поверяем isStopped. !isStopped означает если не isStopped
        while (!isStopped()){
            try {
                Runnable runnable= (Runnable) blockingQueue.take();// будет брать задачи с нашей очереди
                runnable.run();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    /**
     * далее реализуем два синхронайзд метода
     */
    public synchronized void doStop() {
        isStopped = true;// переводим значение переменной isStopped в true
        this.thread.interrupt();// будет убивать поток
    }
    //3. создаем геттер для isStopped и добавляем ключевое слово synchronized, обязательно ставим переб boolean

    public synchronized boolean isStopped() {
        return isStopped;
    }
}
