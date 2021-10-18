package test;

public class TestString {
	public static void main(String[] args) {
		String uri="/webstudy22-front-do-unit-test/FindController.do";
		//위 uri 에서 context path 인 /webstudy22-front-do-unit-test 와 .do 를 제외한 문자열을 추출 
		String contextPath="/webstudy22-front-do-unit-test";
		System.out.println(contextPath.length());
		System.out.println(uri.substring(contextPath.length()+1));//FindController.do
		String name="디카프리오";
		System.out.println(name.substring(2, 4));//beginIndex 2부터 4앞까지 이므로 프리 
		System.out.println(uri.length());//48
		System.out.println(uri.length()-3);//45
		System.out.println(uri.substring(0,uri.length()-3));//0부터 .do 앞까지 추출 /webstudy22-front-do-unit-test/FindController
		System.out.println(uri.substring(contextPath.length()+1,uri.length()-3));
		System.out.println("***********************");
		String str1="/kosta/RegController.do";
		String context="/kosta";
		System.out.println(str1.substring(6));//    /RegController.do
		System.out.println(str1.substring(6+1)); //  RegController.do
		System.out.println(context.length());// 6 
		System.out.println(str1.substring(context.length()+1));// beginIndex 는 7로 할당 ( index 는 0부터 시작하므로 R 부터 시작 ) 
		System.out.println(str1.length());//23
		System.out.println(str1.substring(0, 23-3));// endIndex를 20으로 할당하면 /kosta/RegController  즉 .do 를 제외 , 0부터 시작해 20 index 앞까지 
		System.out.println(str1.substring(context.length()+1, str1.length()-3));
		//
		String str2="/a/b.do";
		String context2="/a";
		System.out.println(str2.substring( 3,4 ));// b 만 추출해본다 , 직접 index를 입력 
		int beginIndex=context2.length()+1;//3
		int endIndex=str2.length()-3;// 7-3 = 4 
		System.out.println(str2.substring(beginIndex, endIndex));
		//줄여서 표현하면 
		System.out.println(str2.substring(context2.length()+1, str2.length()-3));
	}
}






















