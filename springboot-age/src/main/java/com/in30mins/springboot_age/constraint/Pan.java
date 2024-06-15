package com.in30mins.springboot_age.constraint;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = PanCardValidate.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Pan {
    String message() default "pan Not valid";
    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default{};

}
