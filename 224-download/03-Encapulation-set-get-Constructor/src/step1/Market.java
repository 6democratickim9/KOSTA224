package step1;// package: 클래스들을 디랙토리별로 분류하여 관리
//public :가장 넓은 범위; 접근제어자
public class Market {
//	인스턴스 변수
//	String: 문자열 데이터 타입
	String name;
//	메서드: 객체의 기능을 정의
//	keyword: 매개변수(Parameter)
//	return 은 정보를 호출한 쪽으로 반환하기 위해 사용하는 자바 예약어
	public String searchProduct(String keyword) {
		System.out.println("DB에서 정보 조회");
		return name+":"+keyword+"상품검색결과-> 진라면, 신라면";
	}
}
