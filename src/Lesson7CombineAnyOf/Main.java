package Lesson7CombineAnyOf;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/*метод AnyOf  - результат из одной задачи, которая исполнилась быстрее
2 - create CompletableFuture<Object>anyOfFuture
3 - выводим в консоль результат из anyOfFuture
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String>future1=CompletableFuture.supplyAsync(() ->{
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Result Future1";

        });
        CompletableFuture<String>future2=CompletableFuture.supplyAsync(() ->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Result Future2";

        });
        CompletableFuture<String>future3=CompletableFuture.supplyAsync(() ->{
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Result Future3";

        });
        CompletableFuture<Object>anyOfFuture=CompletableFuture.anyOf(future1, future2, future3);
        System.out.println(anyOfFuture.get());

    }
}
