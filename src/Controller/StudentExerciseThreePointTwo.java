package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FillStudent;
import Model.StudentExercise;

/**
 * Servlet implementation class StudentExerciseThreePointTwo
 */
@WebServlet("/StudentExerciseThreePointTwo")
public class StudentExerciseThreePointTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private int i=1;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentExerciseThreePointTwo() {
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
		 
		
		 out.print("<html><body><h3>"+ " Exercise 3.2 " +"</h3><ul>");
		
		
		//FillStudent.studentData().forEach((studentexercise)->out.println(" Student Info:- " + studentexercise + " \n"));
		 
		for(StudentExercise st:FillStudent.studentData())
		{
			 out.print("<h2> Student Id: </h2>"+"<h2>" + i +"</h2>");
			 out.print("<li>");
			 out.print(st.toString());
			 out.print("</li>");
			 i++;
		}
		
		 out.print("</ul></body></html>");
		 
		  

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
