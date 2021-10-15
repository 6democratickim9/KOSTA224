package org.kosta.webstudy21.controller;
//Singleton Design Pattern: 시스템 상에 단 한 번 객체를 생성해 공유하여 사용하고자 할 때 적용하는 디자인 패턴
public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	/*
	 * Use the Reflection API and create the object when runtime begins
	 */
	public Controller create(String command) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//get package name
		String packageInfo=this.getClass().getPackage().getName();
		//클래스명을 문자열에 추가한다
		String classInfo= new StringBuilder(packageInfo).append(".").append(command).toString();
		return (Controller)Class.forName(classInfo).newInstance();
	}
}
