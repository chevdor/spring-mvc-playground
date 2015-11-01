package com.chevtech.hellocontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	@Override
	public void initialize(IsValidHobby isValidHobby) {
	}

	@Override
	public boolean isValid(String txt, ConstraintValidatorContext ctx) {
		if(txt == null)
			return false;
		
		return txt.matches("Music|Ping Pong|Football");
	}
	
}
