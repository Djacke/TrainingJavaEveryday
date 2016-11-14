package com.rescde.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
/**
 * @author Djack Chen
 */
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FieldAnnotation {
	
	public String name() default "Djack Chen";

	public String value() default "Djack Chen";
	
	int[] defaultValue() default {1,3,4};
}
