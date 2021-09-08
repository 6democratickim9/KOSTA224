package step3;

import java.util.TreeSet;

public class TestLottoService {
	public static void main(String[] args) {
		LottoService service=new LottoService();
		//총 5 Set 이 출력된다 ( 5000원치 ) 
		//하나의 Set에는 1~45까지 중복되지 않은 정수가 
		//정렬되어 출력된다 
		for(int i=0;i<5;i++) {
			TreeSet<Integer> set=service.createLottoNumber();
			System.out.println("대박 로또번호:"+set);
		}
	}
}
