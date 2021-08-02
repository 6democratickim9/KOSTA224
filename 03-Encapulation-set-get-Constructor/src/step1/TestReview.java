package step1;

public class TestReview {
	public static void main(String[] args) {
//		Market 객체 생성
		Market m = new Market();
		System.out.println(m.name);
//		null이 출력됨 : 정보가 존재하지 않을 때
		m.name="G마켓";
//		객체의 name 변수에 정보할당
		System.out.println(m.name);
//		라면이라는 인자를 전달(argument)
		String searchResult = m.searchProduct("라면");
		System.out.println("검색결과"+searchResult);
	}

}
