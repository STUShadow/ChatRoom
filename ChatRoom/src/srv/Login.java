package srv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LoginBean;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List loginList = new ArrayList<LoginBean>();

		loginList.add(new LoginBean("佐藤", "sato1234"));
		loginList.add(new LoginBean("けんじ", "qwerty"));

		request.setAttribute("login", loginList);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("/jsp/home.jsp");

		dispatch.forward(request, response);
	}

}
