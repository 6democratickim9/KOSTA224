package step2;
//java.lang.String class�� method test
public class TestString {
	public static void main(String[] args) {
		String name = "������";
		System.out.println(name.concat("��"));
		System.out.println(name.contains("��"));
		System.out.println(name.contains("��"));
		System.out.println(name.indexOf("��"));//�������� ������ index�� -1�� ��ȯ
		System.out.println(name.indexOf("��"));//��ġ��ȯ
		System.out.println(name.startsWith("��"));
		System.out.println(name.endsWith("��"));
		String info="���ϰ��ִ�";
		System.out.println(info);
		System.out.println(info.substring(2));//beginIndex
		System.out.println(info.substring(2,4));//beingIndex���� endIndex����
		String id = " javaking ";
		System.out.println(id.length());
		System.out.println(id.trim().length());
		String nick = "����μ�";
		System.out.println(nick.replace("��", "��"));
		String fileName = "org.springframework.solong.TestServelet";
		System.out.println(fileName.lastIndexOf("."));
		int i = fileName.lastIndexOf(".");
		System.out.println(fileName.substring(i+1));
		System.out.println(fileName.replace("TestServelet", ""));
		
		
	}

}
