package test;

public class TestString {
	public static void main(String[] args) {
		String url="redirect:register-result.jsp";
		System.out.println(url.startsWith("redirect:"));//true 
		if(url.startsWith("redirect:")) {
			System.out.println("redirect:".length());//9자로 구성 
			System.out.println(url.substring(9));// index가 0부터 시작되므로 beginIndex 9부터 문자열을 생성 ( redirect: 을 제외 ) 
		}
	}
}
