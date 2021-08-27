package step2;

public class TestAggregation {
	public static void main(String[] args) {
		SmartPhone sp=new SmartPhone("갤럭시20",120);
		//System.out.println(sp.getModel()+" "+sp.getPrice());
		//위 코드에 대응하는 SmartPhone class를 정의해본다 ( instance variable : model,price , constructor, getter,setter)
		Customer customer=new Customer("코코");
		customer.setSmartPhone(sp);
		System.out.println(customer.getName());
		//코코 고객의 스마트폰 모델명을 반환받아 출력해본다 
		System.out.println(customer.getSmartPhone().getModel());
		//코코 고객의 스마트폰 가격을 반환받아 출력해본다
		System.out.println(customer.getSmartPhone().getPrice());
		System.out.println("******************");
		Customer customer2=new Customer("배니");
		customer2.setSmartPhone(new SmartPhone("아이폰9", 200));
		//custmer2 즉 배니 고객의 스마트폰 모델명을 반환받아 출력
		System.out.println(customer2.getSmartPhone().getModel());
		//가격을 출력 
		System.out.println(customer2.getSmartPhone().getPrice());
		//customer2 고객의 스마트폰 model명을 아이폰11로 변경한다 
		customer2.getSmartPhone().setModel("아이폰11");
		System.out.println(customer2.getSmartPhone().getModel());//아이폰11
	}
}

















