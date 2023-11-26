package Courses.Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> opt1 = Optional.empty();
        Optional<Integer> opt2 = Optional.of(10);
        Optional<Integer> opt3 = Optional.ofNullable(null);
        String str;
        if (getString().isPresent()) {
            str = getString().orElseGet(String::new); // это Supplier <String>
            System.out.println(str);
        }
        // isPresent - означает, что оно присутствует и не является null
//        System.out.println(opt1);
//        System.out.println(opt2);
//        System.out.println(opt3);
    }

    public static Optional<String> getString() {
        if (true) {
            return Optional.of("Simple value");
        }
        return Optional.empty();
        // в этом случае мы возвращаем или значение "Simple value" или пустое значение
    }
}
