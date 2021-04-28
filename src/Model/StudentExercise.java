package Model;

public class StudentExercise {
	
	
	private String lastName;

	private String firstName;

	private int age;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public StudentExercise(String lastName, String firstName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Last Name:  " + lastName + ",  First Name:  " + firstName + ",   Age: " + age + "";
	}
	
	
}
