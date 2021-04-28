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

/**
 * Servlet implementation class Exercise4Point1GetCookie
 */
@WebServlet("/Exercise4Point1GetCookie")
public class Exercise4Point1GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exercise4Point1GetCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Cookie [] cookies=request.getCookies();
		PrintWriter out = response.getWriter();
		
		
		if(cookies != null) {
			out.println("Hey! " + cookies[0].getValue());
			response.setContentType("text/html");
			out.println("<html><body bgcolor=" +cookies[1].getValue()+">");
			out.println("</body></html>");
			}
			else {
			response.sendRedirect("./Exercise4point1.html");
			}
		/*
		 * for(int i=0;i<cookies.length;i++){
		 * out.print("<br>"+cookies[i].getName()+" "+cookies[i].getValue());//printing
		 * name and value of cookie }
		 */  
	
		
		//if(cookies !=null) //it return false because cookie exist JSESSIONID always , if i deleted all cookies it working fine
		//{
//			//out.print("inside if loop");
//			for(Cookie ck:cookies)
//			{
//				//out.print("inside for each");
//				if(ck.getName().equals("user"))
//				{
//					 //response.setContentType("text/html");
//					//out.print("check user");
//					 out.println("Hey ..!!"+"  " +ck.getValue());  			    	
//			    	// out.println("<html><body bgcolor="+ck.getValue()+"/>");
//			    	 //out.println("</body></html>");
//				}
//				else {
//					out.println("user and color cookie not set");
//					//response.sendRedirect("Exercise4point1.jsp"); //if here i redirect it show error 
//					//RequestDispatcher dd = request.getRequestDispatcher("Exercise4point1.jsp");
//
//					//dd.forward(request, response);
//				}
//			}	 
//		}
//	     else {
//	    	 response.sendRedirect("Exercise4point1.jsp");
//	 		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
