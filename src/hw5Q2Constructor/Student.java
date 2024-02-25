package hw5Q2Constructor;

public class Student {
	public String stName;
	public int stID;
	public char gender;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from the default Constructor of the Student class.");
	}

	public Student(String stName, int stID, char gender, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.gender = gender;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name: " + stName + ", ID: " + stID + ", Gender: " + gender
				+ ", and Java Progammer? Ans: " + isProgrammer + ", Grade: " + grade + ".");
	}

}
