package step3;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("���");
		System.out.println(sb);
		System.out.println(sb.append("�δ��"));
		System.out.println(sb.indexOf("��"));
		System.out.println(sb.substring(2,4));
		System.out.println(sb.insert(2,"��"));
		System.out.println(sb.delete(2,5));
		StringBuilder message=new StringBuilder("���Ҹ��� �𸣰ڳ�");
		System.out.println(message);
		
	}

}
