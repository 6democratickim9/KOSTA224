package model;
// 직접 객체화 되어서는 안되므로 abstract class로 선언한다 ( 학생, 교사, 직원 객체가 저장되어야 하므로 ) 
// 자식 클래스에서 멤버를 물려주고 계층 구조 형성해서 다형성 지원을 위한 클래스 
public abstract class Member {
	private String tel;
	private String name;
	private String address;
	public Member(String tel, String name, String address) {
		super();
		this.tel = tel;
		this.name = name;
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {		
		return "tel:"+tel+" name:"+name+" address:"+address+" ";
	}
}












