package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.GuestBookDAO;
import model.GuestBookDTO;

public class TestGuestBookDAO3 {
	public static void main(String[] args) {
		// guestbook 에 insert ( guestbook_no 는 sequence로 자동발급 )
		//TestGuestBookDAO1의 방명록 글등록 기능을 업데이트
		//글등록을 하고 나면 DB에서 발급한 글번호가 GuestBOokDTO에 할당이 되어 있도록
		//registerVer2메서드를 구현해본다(sequnce의 nextval과 함께 currval을 사용한다)
		try {
			GuestBookDAO dao=new GuestBookDAO();
			//최근 글부터 출력되도록 조회한다( guestbook_no 내림차순 ) 
			GuestBookDTO dto=new GuestBookDTO("즐월욜2", "잘쉬고 놀자2");
			System.out.println("글등록 이전 dto: "+dto);
			dao.register(dto);
			System.out.println("방명록에 글등록");
			//db에서 발급한 시퀀스의 nextval한 값이 dto의 guestbookNo인스턴스 변수에 할당되어 있다
			System.out.println("글등록 이후 dto: "+dto);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
