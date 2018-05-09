package srv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RoomEnter")
public class RoomEnter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RoomEnter() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO DBからデータを取得して渡す
		
		RequestDispatcher dispatch = request.getRequestDispatcher("/jsp/chatroom.jsp");
		dispatch.forward(request, response);
	}

}
