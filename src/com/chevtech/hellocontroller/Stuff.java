package com.chevtech.hellocontroller;

public class Stuff {
	public int get_number() {
		return _number;
	}
	public void set_number(int _number) {
		this._number = _number;
	}
	public String get_message() {
		return _message;
	}
	public void set_message(String _message) {
		this._message = _message;
	}
	public Stuff(int _number, String _message) {
		super();
		this._number = _number;
		this._message = _message;
	}
	private int _number;
	private String _message;
}
