package com.hvdbs.codewars.statgenerator;

import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface CodewarsInfo {
    Difficulty difficulty();

    String name();

    String url();
}
