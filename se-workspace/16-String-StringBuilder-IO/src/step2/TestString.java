package step2;
//java.lang.String class의 method test
public class TestString {
	public static void main(String[] args) {
		String name = "아이유";
		System.out.println(name.concat("님"));
		System.out.println(name.contains("이"));
		System.out.println(name.contains("어"));
		System.out.println(name.indexOf("유"));//존재하지 않으면 index는 -1을 반환
		System.out.println(name.indexOf("ㅋ"));//위치반환
		System.out.println(name.startsWith("아"));
		System.out.println(name.endsWith("유"));
		String info="잘하고있다";
		System.out.println(info);
		System.out.println(info.substring(2));//beginIndex
		System.out.println(info.substring(2,4));//beingIndex부터 endIndex까지
		String id = " javaking ";
		System.out.println(id.length());
		System.out.println(id.trim().length());
		String nick = "겸댕인솔";
		System.out.println(nick.replace("겸", "댕"));
		String fileName = "org.springframework.solong.TestServelet";
		System.out.println(fileName.lastIndexOf("."));
		int i = fileName.lastIndexOf(".");
		System.out.println(fileName.substring(i+1));
		System.out.println(fileName.replace("TestServelet", ""));
		
		
	}

}
