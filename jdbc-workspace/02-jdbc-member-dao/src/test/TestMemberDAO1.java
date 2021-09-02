package test;

import model.MemberDAO;
import model.MemberVO;

public class TestMemberDAO1 {
	public static void main(String[] args) {
		try{
			MemberDAO dao= new MemberDAO();
			MemberVO= new MemberVO("servlet","a","이상순","애월읍");
			dao.registerMember(vo);
			System.out.println("register success");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
