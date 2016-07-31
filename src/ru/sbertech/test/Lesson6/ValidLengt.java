package ru.sbertech.test.Lesson6;

/**
 * Created by svetlanashmalko on 31.07.16.
 */
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Student on 28.07.2016.
 */

//@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
 @interface ValidLenth {
    int value() default 4;
}