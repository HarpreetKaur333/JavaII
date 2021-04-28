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
 * Servlet implementation class Exercise4Point3
 */
@WebServlet("/Exercise4Point3")
public class Exercise4Point3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int hitCount; 

	   public void init() { 
	      // Reset hit counter.
	      hitCount = 0;
	   } 

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exercise4Point3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 // Set response content type
	      response.setContentType("text/html");
	      
	    
	      hitCount++;  //  -- increment hitCount 
	      PrintWriter out = response.getWriter();
	      String title = "Total Number of Hits"; 
	      out.println("<html><head><title>" + title + "</title></head>");
	      out.println("<body bgcolor = '#f0f0f0'/><h1 align ='center'> " + title + " </h1><h2 align ='center'> "+ hitCount);
	      out.println("</h2></body></html>");
	      
	    //Creating cookies
	        String hitCount = request.getParameter("hitCount");
	        Cookie cookiehitcount=new Cookie("hitCount",hitCount);
	        
	        cookiehitcount.setMaxAge(60*60*24*365);
	        response.addCookie(cookiehitcount);
	        //out.println("Servlet hit: "+cookiehitcount);
		/*
		 * Cookie [] cookies=request.getCookies();
		 * 
		 * int count = 0; for(Cookie cookie:cookies){
		 * if(cookie.getName().equals("hitCount")){ count =
		 * Integer.parseInt(cookie.getValue()); count++; cookie.setValue(count+"");
		 * out.print(count); } }
		 * 
		 * if(count == 0){ Cookie cookie = new Cookie("hitCount","1");
		 * cookie.setMaxAge(60*60*24*365); response.addCookie(cookie); }
		 */
	      
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
