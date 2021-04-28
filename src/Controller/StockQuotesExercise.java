package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FillStudent;

/**
 * Servlet implementation class StockQuotesExercise
 */
@WebServlet("/StockQuotesExercise")
public class StockQuotesExercise extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	// Math.random() generates random number from 0.0 to 0.999
	double company1 = Math.random()*5;       // Hence, Math.random()*5 will be from 0.0 to 4.999
    double company2 = Math.random()*388;  
    double company3 = Math.random()*219;  
    
    float randomNumber1 = (float)company1;  //cast the double to float number
    int randomNumber2 = (int)company2;     ////cast the double to whole number
    int randomNumber3 = (int)company3;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StockQuotesExercise() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setIntHeader("Refresh", 3); // using setIntheader file
		 PrintWriter out = response.getWriter();
	      
		  out.println("\n Exercise 2.3" + "\n");
	      out.println("\n  Sun MicroSystems:- "+ randomNumber1 + "\n"  );
	      out.println("\n  Microsoft:- "+ randomNumber2 + "\n"  );
	      out.println("\n  CheckPoint Systems:- "+ randomNumber3 + "\n"  );
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	// FillStudent.studentData().forEach((studentexercise)->out.println(" Student Info:- " + studentexercise + " \n"));
		
}
