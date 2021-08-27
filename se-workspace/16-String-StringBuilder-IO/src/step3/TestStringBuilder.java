package step3;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("놀부");
		System.out.println(sb);
		System.out.println(sb.append("부대찌개"));
		System.out.println(sb.indexOf("가"));
		System.out.println(sb.substring(2,4));
		System.out.println(sb.insert(2,"나"));
		System.out.println(sb.delete(2,5));
		StringBuilder message=new StringBuilder("뭔소린지 모르겠네");
		System.out.println(message);
		
	}

}
