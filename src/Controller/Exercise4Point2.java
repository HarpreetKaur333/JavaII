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
 * Servlet implementation class Exercise4Point2
 */
@WebServlet("/Exercise4Point2")
public class Exercise4Point2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exercise4Point2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		boolean cookieisPresent=false;
		PrintWriter out = response.getWriter();
		Cookie [] cookies=request.getCookies(); //getting cookie
		  
		String username = request.getParameter("username");
		String rememberme = request.getParameter("Rememberme");
		String cookieUserName = null;
		String cookieRememberme= null;
		
		if(cookies!=null  ) {
			for(Cookie c : cookies)
			{
				if(c.getName().equals("username")) {
					cookieUserName = c.getValue();	
					continue;
				}
					  response.setContentType("text/html");
				        out.print("<html><meta charset='ISO-8859-1'><title>Exercise 4.2</title><link rel='stylesheet' href='CSS/ExerciseFirst.css'></head><body><h4>Exercise 4.2</h4><fieldset><legend style='margin-left:0px;' class='legend'>login page</legend>");
				        out.print("	<form action='' method='post' class='regfrm'>");
				        out.print("<label style='margin: 0px 10px 10px 40px;'>Enter the UserName: </label>");
				        out.print("<input type='text' name='username' class='txtbox' value='"+cookieUserName+"' style='margin: 0px 10px 10px 40px;'>");
				        out.print("<br><label style='margin:3px 13px 14px 40px;'>Remember my Username:  </label>"+"<input type='checkbox' name='chkRememberme' value='Rememberme' />");
				        out.print("<br><button type='submit' class='submitbtn' style='margin-left:280px'>Submit </button>");
				        out.print("</form></fieldset>");
				        out.print("</body></html>");					      
					
			}
			 	
		}
		else {			
			response.setContentType("text/html");
	        out.print("<html><meta charset='ISO-8859-1'><title>Exercise 4.2</title><link rel='stylesheet' href='CSS/ExerciseFirst.css'></head><body><h4>Exercise 4.2</h4><fieldset><legend style='margin-left:0px;' class='legend'>login page</legend>");
	        out.print("	<form action='' method='post' class='regfrm'>");
	        out.print("<label style='margin: 0px 10px 10px 40px;'>Enter the UserName: </label>");
	        out.print("<input type='text' name='username' class='txtbox' value='' style='margin: 0px 10px 10px 40px;'>");
	        out.print("<br><label style='margin:3px 13px 14px 40px;'>Remember my Username:  </label>"+"<input type='checkbox' name='Rememberme' value=''/>");
	        out.print("<br><button type='submit' class='submitbtn' style='margin-left:280px'>Submit </button>");
	        out.print("</form></fieldset>");
	        out.print("</body></html>");
	        
	        Cookie cookieuser=new Cookie("username",username);
	        Cookie cookierememberme=new Cookie("Rememberme",rememberme);
	        
	        cookieuser.setMaxAge(60*60*24*365);
	        response.addCookie(cookieuser);
	        response.addCookie(cookierememberme);
		
		}

		//Creating two cookies
//        Cookie cookieuser=new Cookie("username",username);
//        Cookie cookierememberme=new Cookie("chkRememberme",rememberme);
//        
//        cookieuser.setMaxAge(60*60*24*365);
//        response.addCookie(cookieuser);
//        response.addCookie(cookierememberme);
//        
//        
//        
//        String getcookiename=cookieuser.getValue(); //here get value of cookie
//		
//        String strformat=String.format("<input name ='username' value='%s' style='margin-left:130px;'/>", getcookiename);
//        
//        response.setContentType("text/html");
//        out.print("<html><meta charset='ISO-8859-1'><title>Exercise 4.2</title><link rel='stylesheet' href='CSS/ExerciseFirst.css'></head><body><h4>Exercise 4.2</h4><fieldset><legend style='margin-left:0px;' class='legend'>login page</legend>");
//        out.print("	<form action='./Exercise4Point2' method='post' class='regfrm'>");
//        out.print("<label style='margin: 0px 10px 10px 40px;'>Username: </label>"+strformat);
//        out.print("<br><label style='margin:3px 13px 14px 40px;'>Remember my Username:  </label>"+"<input type='checkbox' name='chkRememberme' value='Rememberme'/>");
//        out.print("<br><button type='submit' class='submitbtn' style='margin-left:280px'>Submit </button>");
//        out.print("</form></fieldset>");
//        
//        out.print("<h3 style='margin-left: 130px;margin-top: 50px;'>Welcome back: "+getcookiename +"</h3>");
//        out.print("</body></html>");
//        
//        //here check second time cookie exist
//		
//		  Cookie [] cookies=request.getCookies();
//		 
//		  if(cookies !=null)
//		  { 
//			  for(Cookie c : cookies)
//		  {
//				  if(c.getName() != null)
//		  {
//		  out.print("<label style='margin: 0px 10px 10px 40px;'>Username: </label>"+c.
//		 getName()); 
//		  } 
//		  } 
//		  
//		  }
		 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
