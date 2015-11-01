package com.chevtech.hellocontroller;

import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy= HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {
	String listOfValidHobbies() default "Music|Ping Pong";
	
	String message() default "Please provide a valid Hobby " + 
		"amongs Music, Football, etc...";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}