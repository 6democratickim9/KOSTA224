package step1;

public class Person {
	private String name;
	private String address;
	private int money;
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
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Person(String name, String address, int money) {
		super();
		this.name = name;
		this.address = address;
		this.money = money;
	}
}
