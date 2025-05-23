package com.data.btvnss11.model.validation;

import com.data.btvnss11.model.PhoneValidator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneValidator.class)
@Documented
public @interface Phone {

    String message() default "Số điện thoại không hợp lệ (phải bắt đầu bằng 0 và đủ 10 chữ số)";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
