package PatternProducerconsumer;
/* 1. создаем две переменные   LinkedBlockingQueue<String>queue; и final AtomicBoolean stop;
2 создаем конструктор с двумя переменными
3 создаем метод public void start(){
4 создаем цикл fori  for (int i = 0; i < 3; i++)
5 в цикле создаем продюсера и консюмера и передаем туда очередь название продюсера
6  вызываем методы produce на продюсере и consume() на консюмере
7 create ScheduledExecutorService
8 create PSVM Runner runner = new Runner();
9 вносим изменения в конструктор, убрав аргументы с () и добавив в Queue = new LinkedBlockinQueue<>();
10 в PSVM создаем метод start
11 ЗАПУСКАЕМ ПРИЛОЖЕНИЕ ...
Видим, что мы оздали 3 потока Consumer 1, C2, C3, которые получают данные и producer 1, prod 2, prod 3
это те потоки, которые генерируют данные и добавляют их в очередь


 */
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Runner {
    LinkedBlockingQueue<String>queue;
    final AtomicBoolean stop;

    public Runner() {
        this.queue = new LinkedBlockingQueue<>();
        this.stop = new AtomicBoolean(false);
    }
    public void start(){
        for (int i = 0; i < 3; i++) {
            Producer producer = new Producer(queue,stop,  "" + i);
            Consumer consumer = new Consumer(queue, stop, "" + i);
            producer.produce();
            consumer.consume();
        }
        ScheduledExecutorService executorService= Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(() -> stop.set(true), 10, TimeUnit.SECONDS);
        executorService.shutdown();
    }

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.start();
    }
}
