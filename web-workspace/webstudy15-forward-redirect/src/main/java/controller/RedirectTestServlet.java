package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MockDAO;

/**
 * Servlet implementation class RedirectTestServlet
 */
@WebServlet("/RedirectTestServlet")
public class RedirectTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MockDAO dao = new MockDAO();
		dao.register("상품정보");
		response.sendRedirect("redirect-result.jsp");
	}

}
