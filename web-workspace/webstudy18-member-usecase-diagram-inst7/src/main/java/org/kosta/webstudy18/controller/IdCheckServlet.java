package org.kosta.webstudy18.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy18.model.MemberDAO;

/**
 * Servlet implementation class IdCheckServlet
 */
@WebServlet("/IdCheckServlet")
public class IdCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		try {
			boolean result=MemberDAO.getInstance().idcheck(id);
			String path=null;
			if(result)//아이디가 존재하면 사용할 수 없으므로 idcheck-fail 로 이동 
				path="idcheck-fail.jsp";
			else
				path="idcheck-ok.jsp";
			request.getRequestDispatcher(path).forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}















