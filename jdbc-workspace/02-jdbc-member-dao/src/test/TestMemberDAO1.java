package test;

import model.MemberDAO;
import model.MemberVO;

public class TestMemberDAO1 {
	public static void main(String[] args) {
		try{
			MemberDAO dao= new MemberDAO();
			MemberVO= new MemberVO("servlet","a","이상순","애월읍");
			if(dao.findMemberById(vo.getId())!=null) {
				System.out.println("아이디가 이미 존재합니다");
			}else {
				dao.registerMember(vo);
				System.out.println("등록완료");
			}
			dao.registerMember(vo);
			System.out.println("register success");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
