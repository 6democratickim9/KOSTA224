package step3;

import java.util.TreeSet;

public class TestLottoService {
	public static void main(String[] args) {
		LottoService service=new LottoService();
		//�� 5 Set �� ��µȴ� ( 5000��ġ ) 
		//�ϳ��� Set���� 1~45���� �ߺ����� ���� ������ 
		//���ĵǾ� ��µȴ� 
		for(int i=0;i<5;i++) {
			TreeSet<Integer> set=service.createLottoNumber();
			System.out.println("��� �ζǹ�ȣ:"+set);
		}
	}
}
