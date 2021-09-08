package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.GuestBookDAO;
import model.GuestBookDTO;

public class TestGuestBookDAO4 {
	public static void main(String[] args) throws SQLException {
		//LIKE 연산자를 이용해서 방명록 글제목 검색
		try {
			GuestBookDAO dao = new GuestBookDAO();
			String keyword="즐";
			//keyword ="월";
			
			ArrayList<GuestBookDTO> list = dao.getAllGuestBookListLikeKeyword(keyword);
			for(GuestBookDTO dto:list)
				System.out.println(dto);//list에 있는 모든 요소를 순차적으로 dto에 할당하면서 반복한다
//			for(int i =0; i<list.size();i++)
//				System.out.println(list.get(i));
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
