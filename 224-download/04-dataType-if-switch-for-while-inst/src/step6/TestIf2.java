package step6;

public class TestIf2 {
	public static void main(String[] args) {
		MyDate d=new MyDate();
		d.setMonth(8);
		System.out.println(d.getMonth());
		System.out.println("****");
		MyDate d2=new MyDate();
		//month는 1~12 사이의 값이어야 한다 
		d2.setMonth(13);//13 월은 잘못된 입력값입니다 
		System.out.println(d2.getMonth());//1
	}
}
