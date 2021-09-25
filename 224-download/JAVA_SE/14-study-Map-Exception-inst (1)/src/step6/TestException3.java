package step6;

import java.util.ArrayList;

/*
 *  case 1 
 *  ���α׷� ����� Exception ��Ȳ �߻��Ǹ� 
 *  JVM�� Exception ��ü�� ������ �޼����� �ֿܼ� ����ϰ� ���α׷� �����Ű�� ���� Ȯ���ϴ� ���� 
 *  
 *  �Ʒ� �ڵ带 �����ϸ� 
 *  JVM �� Exception in thread "main" java.lang.NullPointerException
	at step6.TestException1.main(TestException1.java:11) 
	�޼����� �ܼ�ȭ�鿡 ����ϰ� ���α׷��� ������ ����ȴ� 
	
	case 2 
	TestException1 ��Ȳ���� Exception Handling(����ó��) �� �ϴ� ���� 
	try �� catch ��� �ڹ� Ű���带 �̿��� Ư�� ���� ��Ȳ�� �߻��Ǹ� ����帧�� �����ϰ�
	���α׷��� ���� ����ǵ��� ���ܸ� ó���Ѵ� 
	try{
		//���� ��Ȳ �߻� ���� ���� 
	}catch(NullPointerException ne){ // ���ܰ� �߻��� �� catch ������ ����ȴ� 
		//���� ó���Ͽ� ��� �帧�� �����ϴ� ���� 
	}
	case 1 �� case 2 �� ���̴� case2 ���� try catch �� �̿��� Exception Handling �ؼ� 
	���� ��Ȳ �߻��� ���α׷� ������ ������� �ʰ� 
	����帧�� ������ �� ���α׷��� ���� ���� �Ǵ� �� �ִ� 
	
	case 3 
	�ϳ��� try ���� ���� �������� Exception�� �߻��� �� �ִ�
	�� ��� �ϳ��� try ������ ���� ���� ���� catch ������ ���ǵ� �� �ִ� 
	Exception catch ����� ��Ӱ��迡 ������ 
	��ü�� ����( �ڽ� ���� Ŭ���� ) ���� �߻��� ���� ( �θ� ���� Ŭ���� ) ������ 
	�����ؼ� ���ܸ� ó���� �� �ִ�. 
 */
public class TestException3 {
	public static void main(String[] args) {
		String name="������";
		//test�� ���� name�� null�� ���Ҵ��غ��� 
		//name=null;
		ArrayList<String> list=new ArrayList<String>();
		try { // try ������ ���� �߻� ���� ���� 
			System.out.println(name.length());
			System.out.println(list.get(0));
		}catch(NullPointerException ne) {// ���� �߻��ϸ� ����Ǵ� ���� 
			System.out.println("name ������ �����Ƿ� ���̸� ���� �� �����ϴ�");
		}catch(IndexOutOfBoundsException ie) {
			System.out.println("����Ʈ ��Ұ� �������� �ʾ� ��ȯ�� �� �����ϴ�");
		}catch(Exception e) {// �ڽ� -> �θ� ������ catch ������ �����ؾ� �Ѵ� 
			e.printStackTrace();//���� �߻� ��θ� ��� ����Ѵ� 
		}
		System.out.println("���α׷� ���� ����");
	}
}























