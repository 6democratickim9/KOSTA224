package test;

import org.kosta.model.MemberDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationIOC_DI {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
		MemberDAO memberDAO=(MemberDAO)ctx.getBean("memberDAOImpl");
		memberDAO.register("아이유 오리");
		ctx.close();
	}

}
