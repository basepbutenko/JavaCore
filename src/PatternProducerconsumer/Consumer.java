package PatternProducerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/*
Это второй класс в который копируем свои переменные и вместо перемнной producerName создаем
Private String consumerName;
далее создаем конструктор с тремя параметрами
далее создаем такой же метод void consume и подобное тому, что было в предыдущем классе
УЧТИ, что в классе Consumer нет queue.add("Prducer" +producerName+"at"+new Date()); , но после TimeUnit идет System
, чего нет в продюсере
ДАЛЕЕ Создаем класс Runner
 */
public class Consumer {
    private final LinkedBlockingQueue<String> queue;
    private final AtomicBoolean stop;
    private String consumerName;
    private ExecutorService executorService= Executors.newSingleThreadExecutor();

    public Consumer(LinkedBlockingQueue<String> queue, AtomicBoolean stop, String consumerName) {
        this.queue = queue;
        this.stop = stop;
        this.consumerName = consumerName;
    }
    void consume(){
        final Runnable runnable=()->{
          while (!stop.get()){
              try {
                  TimeUnit.MILLISECONDS.sleep(500);
                  System.err.println("Consumer" + consumerName+queue.poll(1000, TimeUnit.MILLISECONDS));
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
          executorService.shutdown();
        };
        executorService.submit(runnable);
    }
}
