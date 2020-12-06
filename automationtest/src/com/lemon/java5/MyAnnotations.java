package com.lemon.java5;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
/**
 * @author shkstart
 * @create 2020--11--26--20:21
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE,FIELD,METHOD,PARAMETER})
public @interface MyAnnotations {
    MyAnnotation[] value();
}
