package PatternProducerconsumer;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/*
это первый класс который создается и в нем создаем приватную файнал переменную типа
1  LinkedBlockingQueue<String>queue private final AtomicBoolean stop;
    private String producerName;
    private ExecutorService executorService= Executors.newSingleThreadExecutor();
 2  create Constructor  с тремя параметрами LinkedBlockingQueue<String> queue, AtomicBoolean stop, String producerName
 3 создаем метод void produce и в лямбде создаем цикл while (!stop.get()){ в котором будем добавлять в нашу
 очередь сообщение
 когда мы вызовем метод void produce(){ у нас создастся новый final Runnable runnable = ()->{, который
 запустится в  executorService.submit(runnable) и будет исполняться, пока наш while (!stop.get()){ будет FALSE
 и когда STOP поменяется на TRUE, тогда вызовется метод  executorService.shutdown();и наш producer будет уничтожен

ДАЛЕЕ СОЗДАЕМ НОВЫЙ КЛАСС Consumer

 */
public class Producer {
    private final LinkedBlockingQueue<String>queue;
    private final AtomicBoolean stop;
    private String producerName;
    private ExecutorService executorService= Executors.newSingleThreadExecutor();

    public Producer(LinkedBlockingQueue<String> queue, AtomicBoolean stop, String producerName) {
        this.queue = queue;
        this.stop = stop;
        this.producerName = producerName;
    }
    void produce(){
        final Runnable runnable = ()->{
            while (!stop.get()){
                queue.add("Prducer" +producerName+"at"+new Date());
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            executorService.shutdown();
        };
        executorService.submit(runnable);
    }
}
