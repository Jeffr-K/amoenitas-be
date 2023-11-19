package com.annonymous.amoenitas.infrastructure.utils.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValueOfEnumValidator implements ConstraintValidator<Enums, CharSequence> {
  private Set<String> values;

  @Override
  public void initialize(Enums annotation) {
    values = Stream.of(annotation.enumClass().getEnumConstants())
      .map(Enum::name)
      .collect(Collectors.toSet());
  }

  @Override
  public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
    return value == null || values.contains(value.toString());
  }
}
