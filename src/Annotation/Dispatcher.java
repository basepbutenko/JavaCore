package Annotation;

import Annotation.handler.MathHandler;

import java.lang.reflect.Method;

public class Dispatcher {
    public static void main(String[] args) throws NoSuchMethodException {
        MathHandler mathHandler = new MathHandler();
        Class<?> cl = MathHandler.class;
        Method m = cl.getDeclaredMethod( "addTwoNumbers", int.class, int.class);
        MathAnno mathAnno = m.getAnnotation(MathAnno.class);// добавляем аннотации
        mathHandler.addTwoNumbers(mathAnno.num1(), mathAnno.num2());
    }
}
/**
 * 1 создаем аннотацию , помещаем таргет и ретеншион, создаем 2 поля num1 and num2 типа int со значением 0 по дефолту
 * 2 создаем MathHandler который принимает аннотацию MathAnno со значениями num1 = 10 и num2= 20  и выводим
 * сумму этих двух значений
 * 3 создаем класс Dispatcher , создаем объект MathHandler
 * 4 при помощи класса Класс мы считываем всю информацию о MathHandler
 * 5 Обращаемся к классу Method и считываем при помощи getDeclaredMethod (так как он может быть приватным)
 * "addTwoNumbers", int.class, int.class
 * 6 обращаемся к классу MathAnno и при помощи метода m.getAnnotation обращаемся и считываем (MathAnno.class)
 * 7 По ссылке  mathHandler вызываем метод addTwoNumbers передавая туда 2 параметра num1(), mathAnno.num2()
 * 8 получаем значение 30 (10 +20)
 * /Users/oleksijbutenko/IdeaProjects/JavaCore/src/Annotation/handler
 */