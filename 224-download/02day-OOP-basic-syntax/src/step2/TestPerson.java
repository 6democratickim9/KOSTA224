package step2;

public class TestPerson {
	public static void main(String[] args) {
		/*객체 생성을 위한 코드라인
		 * Person: 클래스명이고 참조형 데이터 타입
		 * p: 변수, 참조변수, 객체를 참조하기 위한 주소값을 저장하는 공가
		 * =:assign:할당
		 * new: 객체 생성을 위한 자바 키워드
		 * Person():생성자 constructor
		 */
		Person p =new Person();
		System.out.println(p.name);//객체의 속성에 접근해 값 출력
		p.eat();
//		변수=속성값을 재할당
		p.name="이강인";
		System.out.println(p.name);
		p.eat();
	}

}
