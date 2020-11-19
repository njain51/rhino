package main.java.collections.main.java.corejava.example_annotations.custom_annotation.two;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // to be run at runtime only.
@Target(ElementType.METHOD) //can use in method only.
public @interface Test {    // @interface tells java this is a custom annotation

    //should ignore this test?
    public boolean enabled() default true;

}
