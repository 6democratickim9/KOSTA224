package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Tool;

public class TestUser2_IOC {
public static void main(String[] args) {
	ClassPathXmlApplicationContext  factory = new ClassPathXmlApplicationContext("ioc.xml");
	Tool tool=(Tool)factory.getBean("tool");
	tool.work();
	factory.close();
}
}
