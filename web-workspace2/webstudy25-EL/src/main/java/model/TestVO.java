package model;
//JSP EL에서 접근해 사용가능한 메서드는 get 계열의 메서드와 is 계열의 메서드
public class TestVO {
	private String id = "minju";
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		System.out.println("testVO getName() run");
		return "iu";
	}
	//EL에서 접근불가
//	public String findInfo() {
//		return "pasta";
//	}
	public String getInfo() {
		return "pasta";
	}
	//EL에서 접근가능
	public boolean isExist() {
		return false;
	}
}
