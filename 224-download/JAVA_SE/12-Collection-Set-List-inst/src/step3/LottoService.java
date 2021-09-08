package step3;

import java.util.Random;
import java.util.TreeSet;

public class LottoService {
	/**
	 * 로또 1~45까지의 정수 ( 중복되어서는 안된다 ) 6개가 나와야 한다 
	 * 
	 * 임의의 수 발생시키기 위해 Random 을 이용 
	 * 
	 * 중복 인정 x , 정렬 위해 TreeSet 이용 
	 * 
	 * while loop 가 적합 ( 이유는 Random 의 nextInt() 는 동일한 정수를 만들수도 있기 때문에 ) 
	 * -> TreeSet 의 size() 가 6 이 될때까지 반복해야 함 
	 * @return
	 */
	public TreeSet<Integer> createLottoNumber() {
		TreeSet<Integer> set=new TreeSet<Integer>();
		Random r=new Random();
		while(set.size()<6) {
			//nextInt(45) 는 0~44까지 랜덤한 수가 나오므로 +1 을 한다 
			set.add(r.nextInt(45)+1);
		}
		//만약 for 문으로 표현한다면 
		/*
		 	for(;set.size()<6;){
		 		set.add(r.nextInt(45)+1);
		 	}
		 */
		return set;
	}
}



















