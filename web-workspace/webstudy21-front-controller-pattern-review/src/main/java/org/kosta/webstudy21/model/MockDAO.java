package org.kosta.webstudy21.model;

public class MockDAO {
	//Singletion Design Pattern
	private static MockDAO instance=new MockDAO();//instance라는 객체에 MockDAO를 상속
	private MockDAO() {

	}
	public static MockDAO getInstance() {
		return instance; //getIntance라는 메서드는 return 할 때 instance, 즉 MockDAO를 상속받게 한다
	}
	public String findProductById(String id) {
		String productInfo=null;
		if(id.equals("1"))
			productInfo=id+" shrimpchip";
		return productInfo;
	}
	public void registerProduct(String productInfo) {
		System.out.println(" Information of "+productInfo+" has been registered");
	}

}
