package test;

import java.sql.SQLException;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberVO;

public class TestMemberDAO2_me {
	public static void main(String[] args) {
		try {
			MemberDAO dao = new MemberDAO();
			Scanner scanner = new Scanner(System.in);
			System.out.println("검색할 회원 아이디를 입력하세여");
			String id = scanner.nextLine();
			MemberVO memberVO=dao.findMemberById(id);
			if(memberVO!=null) {
				System.out.println("검색결과: "+memberVO);
			}else {
				System.out.println(id+"아이디를 가진 회원정보없음");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
