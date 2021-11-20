package test;

import org.kosta.model.service.ProductService;

import model.MemberService;

public class TestLog4j {
	public static void main(String[] args) {
		MemberService service = new MemberService();
		service.logtest();
		System.out.println("****************");
		ProductService ps = new ProductService();
		ps.deleteProduct();
		ps.findProduct();
		ps.register();
	}

}
