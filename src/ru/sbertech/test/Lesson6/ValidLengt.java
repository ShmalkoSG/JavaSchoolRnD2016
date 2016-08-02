package ru.sbertech.test.Lesson6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Student on 28.07.2016.
 */

//@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface ValidLength {
    int value() default 4;
}