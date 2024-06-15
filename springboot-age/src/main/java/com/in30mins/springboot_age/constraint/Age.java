package com.in30mins.springboot_age.constraint;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = AgeValidation.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Age {
    String message() default "Age must 18 years";
    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default{};
}
