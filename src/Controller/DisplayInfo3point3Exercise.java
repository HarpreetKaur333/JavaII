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
 * Servlet implementation class DisplayInfo3point3Exercise
 */
@WebServlet("/DisplayInfo3point3Exercise")
public class DisplayInfo3point3Exercise extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayInfo3point3Exercise() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		PrintWriter out = response.getWriter();
		
		String ChkSession[]=request.getParameterValues("ChkSession"); //here use array for multi values
		
		
		String DisplayInfo ="Last Name: "+ request.getParameter("lastname")+"<br>" +" First Name:  "+ request.getParameter("firstname")+"<br>" +" Course: "+request.getParameter("course")+"<br>"+" Meeting: "+ request.getParameter("time"); 
		
		out.print("<html><body><h2>Response: </h2><br><h3>"+ DisplayInfo + " <br>Session:  ");
		for(String s:ChkSession)
		{
			out.print("<h3>"+ s +" , "+"</h3>"+"</h3>");
		}
		out.print("</body></html>");
		
		doGet(request, response);
	}
}

