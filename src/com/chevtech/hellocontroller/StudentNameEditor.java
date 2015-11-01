package com.chevtech.hellocontroller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String name) throws IllegalArgumentException{
		if(name.contains("Mr.") || name.contains("Mr.")){
			setValue(name);
		} else
			name = "Ms. " + name;
		setValue(name);
	}
}
