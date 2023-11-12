package com.annonymous.ttaleum.infrastructure.utils.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Documented
@Constraint(validatedBy =  ValueOfEnumValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(FIELD)
@NotNull
public @interface Enums {
  Class<? extends Enum<?>> enumClass();

  String message() default "";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
