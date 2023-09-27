package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)// применяется только к методам
@Retention(RetentionPolicy.RUNTIME)
public @interface MathAnno {
    int  num1 () default 0;
    int num2()default 0;
}
