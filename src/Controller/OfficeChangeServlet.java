package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OfficeChangeServlet
 */
@WebServlet("/OfficeChangeServlet")
public class OfficeChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OfficeChangeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		double amount=0;
		double result=0;
		String  value=request.getParameter("dollarvalue");
		String  conversiontype=request.getParameter("type");
		
		 amount=Double.parseDouble(value);
		 
		 if(conversiontype.equals ("US"))
		 {
			 result = 0.94*amount;
		 }
		 if(conversiontype.equals ("FR")) {
			 result = 0.70*amount;
		 }
		
		 out.print("<html><body><h2>Result: </h2><br><h3>"+ result +"</h3>");
		 out.print("<a href='mottoForm.html'>Back to Conversion Page</a");
		 //response.sendRedirect("motoForm.html.html");
		 out.print("</body></html>");
		
		 doGet(request, response);
		
	}

}
