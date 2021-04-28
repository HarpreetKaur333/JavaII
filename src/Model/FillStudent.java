package Model;

import java.util.ArrayList;

//import com.sun.tools.javac.util.List;

public class FillStudent {

	public static  ArrayList<StudentExercise>  studentData()
	{
		ArrayList<StudentExercise> students = new ArrayList<StudentExercise>();
		
		StudentExercise se1 = new StudentExercise("Kaur", "Harpreet", 24);
		StudentExercise se2 = new StudentExercise("Singh", "Raman", 28);
		StudentExercise se3 = new StudentExercise("Gupta", "Raj", 26);
		students.add(se1); 
		students.add(se2); 
		students.add(se3); 
		return students;
	
	}
}
