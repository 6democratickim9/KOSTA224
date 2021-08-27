package step7;

public class CreditCard {
	private String info;
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	//	생성자를 직접 명시해 객체 생성시에 정보를 할당받게 한다
	public CreditCard(String info) {
		this.info=info;
	}

}
