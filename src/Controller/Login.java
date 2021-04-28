package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String emailid = "harpreet@gmail.com";
	private final String passwd = "isi";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out= response.getWriter();
		
		String email = request.getParameter("email");
		String pwd = request.getParameter("pass");
		
		if(email.equals(emailid) && pwd.equals(passwd)){
			HttpSession session = request.getSession();
			session.setAttribute("email", "harpreet@gmail.com");
			session.setAttribute("password", "isi");
			session.setMaxInactiveInterval(30*60);
			
//			Cookie userName = new Cookie("user", user);
//			userName.setMaxAge(30*60);
//			response.addCookie(userName);
			response.sendRedirect("portal.jsp");
		}else{
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/error.jsp");
			
			out.println("<font color=red>Either user name or password is wrong.</font>");
			rd.include(request, response);
		}

	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
