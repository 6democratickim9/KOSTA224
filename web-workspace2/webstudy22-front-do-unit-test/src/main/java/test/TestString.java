package test;

public class TestString {
	public static void main(String[] args) {
		String uri="/webstudy22-front-do-unit-test/FindController.do";
		//위 uri에서 context path인 /webstudy22-front-do-unit-test와 .do를 제외한 문자열 추출
		String contextPath="/webstucy22-front-do-unit-test";
		System.out.println(contextPath.length());
		System.out.println(uri.substring(contextPath.length()+1));
		System.out.println(uri.substring(contextPath.length()+1));
		System.out.println(uri.substring(contextPath.length()+1,uri.length()-3));
		String name="디카프리오";
		System.out.println(name.substring(2,4));
	}

}
