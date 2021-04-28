package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionController
 */
@WebServlet("/SessionController")
public class SessionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("userName");
		String password = request.getParameter("userPassword");
		
		out.println("Welcome username: "+name);
		out.println("Here is your password: "+password);
	        
		
		//here i am set the session
		  HttpSession session = request.getSession();
//	        writer.println("Session ID: " + session.getId());
//	        writer.println("Creation Time: " + new Date(session.getCreationTime()));
//	        writer. println("Last Accessed Time: " + new Date(session.getLastAccessedTime()));
//	        
	        session.setAttribute("Username",name);
	        session.setAttribute("password", password);
	        
	        
	       
	       // String username = (String) session.getAttribute("username");
	        //String password = (String) session.getAttribute("password");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
