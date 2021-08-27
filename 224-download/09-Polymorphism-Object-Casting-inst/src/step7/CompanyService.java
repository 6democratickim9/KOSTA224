package step7;

import step4.Animal;
import step4.Person;

public class CompanyService {
	public void playAll(Animal[] ani) {
		for(int i=0;i<ani.length;i++) {
			//배열 요소가 Person 객체인지 확인 
			if(ani[i] instanceof Person) {
				//Person의 독자적 멤버(메서드)를 실행하기 위해 Object down casting을 한다 
				((Person) ani[i]).ticketing();
			}
			ani[i].play();
		}//for		
	}//method
}//class
