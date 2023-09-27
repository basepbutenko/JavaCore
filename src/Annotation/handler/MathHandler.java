package Annotation.handler;

import Annotation.MathAnno;

public class MathHandler  {
    @MathAnno(num1 = 10, num2 = 20)
    public void addTwoNumbers (int num1,int num2){
        System.out.println(num1 + num2) ;// подсчет значений, которые мы передали при помощи аннотации
    }
}
