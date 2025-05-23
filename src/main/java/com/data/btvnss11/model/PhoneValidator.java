package com.data.btvnss11.model;

import com.data.btvnss11.model.validation.Phone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class PhoneValidator implements ConstraintValidator<Phone, String> {

    @Override
    public void initialize(Phone constraintAnnotation) {
    }

    @Override
    public boolean isValid(String phoneField, ConstraintValidatorContext context) {
        if (phoneField == null) {
            return true;
        }
        return phoneField.matches("^0\\d{9}$");
    }
}

