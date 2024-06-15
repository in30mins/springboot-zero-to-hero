package com.in30mins.springboot_age.constraint;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PanCardValidate implements ConstraintValidator<Pan,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
    }
}
