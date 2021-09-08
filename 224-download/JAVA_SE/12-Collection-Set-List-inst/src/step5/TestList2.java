package step5;

import java.util.ArrayList;
// TestList2 는 Generic 을 적용하지 않았을 때의 예 , Generic을 적용한 TestList3과 비교해본다 
public class TestList2 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new FriendDTO("아이유", 100));
		list.add(new FriendDTO("박보검", 200));
		list.add(new FriendDTO("강하늘", 50));
		//list.add("ㅋㅋㅋ");//Generic을 적용하지 않아서 다른 타입의 요소도 추가 가능 
		// list 요소 중 index가 1 인 요소의 name을 출력하고자 한다 
		/*
		Object o=list.get(1);
		FriendDTO dto=(FriendDTO)o;//형변환, Object down casting이 필요 
		System.out.println(dto.getName());//자식 클래스의 독자적 멤버를 호출할 수 있음 
		*/
		//아래와 같이 줄여서 쓰면 
		//FriendDTO dto=(FriendDTO)list.get(1);
		//System.out.println(dto.getName());
		//더 줄이면 
		System.out.println(((FriendDTO)list.get(1)).getMoney());
		//for문을 이용해 요소의 getMoney() 호출해서 money를 출력 
		for(int i=0;i<list.size();i++) {
			FriendDTO fd=(FriendDTO)list.get(i);
			System.out.println(fd.getMoney());
		}
	}
}









