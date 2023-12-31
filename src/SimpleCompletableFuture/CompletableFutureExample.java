package SimpleCompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
/*
1  далее вместо конструктора на 10 строке мы меняем на completedFuture("Result") в этом случае мы получили
значение true из метода isDone, что означает, что наш CF завершен и с помощью метода get мы получили данный результат

2 создаем с методом failedFuture(new RuntimeException); При это обязательно предыдущий закомментируем //
в этом случае метод isDone дал true, значит CF завершен и когда мы вызвали метод get мы получили RuntimeException

3 далее создаем completedSage, а именно: CompletionStage<String>completionStage=CompletableFuture.complereStage("Result
 from CompletionStage"); далее sopl (completionStage.toCompletableFuture().isDone and
 sopl(completionStage.toCompletableFuture().get()); При этом две предыдущие строчки SOPL закомментируем
 */
public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
      //  CompletableFuture<String>completableFuture= CompletableFuture.completedFuture("Result");
        CompletableFuture<String>completableFuture= CompletableFuture.failedFuture(new RuntimeException());
        CompletionStage<String> completionStage=CompletableFuture.completedStage("Result from CompletionStage");
        // далее выводим на экран результат CF isDone
//        System.out.println(completableFuture.isDone());// так мы узнаем, завершилось ли наше CF или нет
//        System.out.println(completableFuture.get());// так мы узнаем, завершилось ли наше CF или нет
        System.out.println(completionStage.toCompletableFuture().isDone());
        System.out.println(completionStage.toCompletableFuture().get());


    }
}
