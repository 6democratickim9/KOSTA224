package org.kosta.webstudy27.model;


public class MockDAO {
	private static MockDAO instance=new MockDAO();
	private MockDAO() {}
	public static MockDAO getInstance() {
		return instance;
	}
	public String findCustomerById(String id) {
		String customerInfo=null;
		if(id.equals("java"))
			customerInfo=id+" 아이유 오리";
		return customerInfo;
	}
	public void registerCustomer(String customerInfo) {
		System.out.println("고객정보등록: "+customerInfo+" db에 insert");
	}
	public void updateCustomer(String customerInfo) {
		System.out.println("고객정보수정:"+customerInfo+" db에 update");
	}
	public void deleteCustomer(String customerId) {
		System.out.println(customerId+"아이디 고객정보삭제 db에 delete");
	}
}