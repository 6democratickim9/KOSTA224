package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberVO;

/**
 * Servlet implementation class FindMemberByIdServlet
 */
@WebServlet("/FindMemberByIdServlet")
public class FindMemberByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*	컨트롤러 로직 
		 * 1. 클라이언트가 전달한 아이디를 받아온다 
		 * 2. Model( MemberDAO ) 과 연동해서 결과(MemberVO)를 반환받는다 
		 * 3. 반환받은 MemberVO 가 null 이면 
		 * 	   findMemberById-fail.jsp 로 이동시킨다 ( forward ) 
		 * 4. 반환받는 MemberVO 가 null 이 아니면 
		 * 	   request 에 MemberVO를 할당한다.
		 *     findMemberById-ok.jsp로 이동시킨다 ( forward ) 
		 */
		String id=request.getParameter("memberId");
		try {
			MemberDAO dao=new MemberDAO();
			MemberVO vo=dao.findMemberById(id);
			String path=null;
			if(vo==null) {//아이디에 대한 회원정보가 존재하지 않으면 
				path="findMemberById-fail.jsp";
			}else {//존재하면 
				request.setAttribute("memberVO", vo);
				path="findMemberById-ok.jsp";
			}
			request.getRequestDispatcher(path).forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}		
	}
}
























