package com.pop.order.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(TulingImportSelector.class)
public @interface TulingEnableAutoConfig {

}