package org.kosta.webstudy18.controller;

import java.io.IOException;



/**
 * Servlet implementation class FindMemberByIdServlet
 */
@WebServlet("/FindMemberByIdServlet")
public class FindMemberByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("memberId");
		try {
			MemberVO vo = MemberDAO.getInstance().findMemberById(id);
			String path = null;
			if(vo==null) {
				path = "findbyid-fail.jsp";
			}else {
				request.setAttribute("memberVO", vo);
				path="findbyid-ok.jsp";
			}
			request.getParameter(path).forward(request,response);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
