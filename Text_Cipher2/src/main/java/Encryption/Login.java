package Encryption;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Request proceesing logic
		String U_name = request.getParameter("user_name");
		String Pass = request.getParameter("user_password");
		
		request.getSession().setAttribute("user_name", U_name);
		request.getSession().setAttribute("user_password", Pass);
		
		response.sendRedirect("html/EnterDetails.html");
	}

}

