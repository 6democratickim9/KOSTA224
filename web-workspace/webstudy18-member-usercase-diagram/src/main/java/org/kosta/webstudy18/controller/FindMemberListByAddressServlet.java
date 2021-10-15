package org.kosta.webstudy18.controller;

import java.io.IOException;

/**
 * Servlet implementation class FindMemberListByAddressServlet
 */
@WebServlet("/FindMemberListByAddressServlet")
public class FindMemberListByAddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String address=request.getParameter("address");
		try {
			ArrayList<MemberVO> list=MemberDAO.getInstance().findMemberListByAddress(address);
			request.setAttribute("list", list);
			request.getRequestDispatcher("findbyaddress-result.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
