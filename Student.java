public class Student extends Person implements Gradable {

	public String name;

	public String studentID;

	private double gpa;

	private ArrayList<String> enrolledCourses;

	public void enrollInCourse() {

	}

	public double calculateGPA() {
		return 0;
	}

	public void dropCourse() {

	}


	/**
	 * @see Gradable#calculateGrade()
	 */
	public double calculateGrade() {
		return 0;
	}

}
