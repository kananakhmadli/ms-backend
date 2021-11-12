package com.company.validator;

import com.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueEmilValidator implements ConstraintValidator<UniqueEmail, String> {

    @Autowired
    public UserRepository userRepository;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return userRepository.checkByEmail(email);
    }
}
