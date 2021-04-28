package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCounts
 */
@WebServlet("/ServletCounts")
public class ServletCounts extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int servletcount; 

	   public void init() { 
	      // Reset hit counter.
		   servletcount = 0;
	   } 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCounts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		servletcount++; 
			
			PrintWriter out = response.getWriter();
		      
		      out.println("\n  The number of times Servlet hit the sever "+ servletcount + "\n"  );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
