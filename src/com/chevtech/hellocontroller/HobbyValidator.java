package com.chevtech.hellocontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	private String listOfValidHobbies;

	@Override
	public void initialize(IsValidHobby isValidHobby) {
		this.listOfValidHobbies= isValidHobby.listOfValidHobbies();
	}

	@Override
	public boolean isValid(String txt, ConstraintValidatorContext ctx) {
		if(txt == null)
			return false;

		return txt.matches(this.listOfValidHobbies);
	}

}
