package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.MemberService;

public class TestDI {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("spring-config.xml");
		MemberService ms= (MemberService)factory.getBean("memberService");
		ms.registerMemberAndPoint("아이유 오리", "cgv 10000");
		factory.close();
	}

}
