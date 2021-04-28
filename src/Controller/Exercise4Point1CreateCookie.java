package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Exercise4Point1Cookie
 */
@WebServlet("/Exercise4Point1CreateCookie")
public class Exercise4Point1CreateCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exercise4Point1CreateCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//here check cookie exist or not
		
			PrintWriter out = response.getWriter();
			String user = request.getParameter("user");
	         String color = request.getParameter("color");
	         
	       //Creating two cookies
	         Cookie cookieuser=new Cookie("user",user);
	         Cookie cokkiecolor=new Cookie("color",color);
	         
	         cookieuser.setMaxAge(60*60*24*365);
	         cokkiecolor.setMaxAge(60*60*24*365);
	         
	 		 response.addCookie(cookieuser);
	 		 response.addCookie(cokkiecolor);
	 		 
	 		 out.println("User" + cookieuser.getValue()); //here print user cookie
	 		 out.println("Color" + cokkiecolor.getValue()); //here print color cookie
	 		 
	 		 response.sendRedirect("./Exercise4Point1GetCookie");
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		doGet(request, response);
	}

}
