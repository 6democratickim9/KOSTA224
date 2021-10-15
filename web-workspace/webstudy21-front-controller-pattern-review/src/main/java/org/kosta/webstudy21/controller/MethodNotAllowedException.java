package org.kosta.webstudy21.controller;

public class MethodNotAllowedException extends Exception{
	private static final long serialVersionUID = -1578543632742170795L;
	public MethodNotAllowedException() {
		super("forbidden Request Method Access");
	}
}
