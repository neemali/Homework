package hw4JavaVariablesDeclared.copy;

public class AboutMe {
	public boolean isMyHomeWorkComplete;
//	The above variable is declared.
	public String myName;
	public byte myAge;
	public short myCarPayment;
	public int myWorkHours;
	public long myFreeTime;
	public float myPatience;
	public double myStressLevel;
	public char amILikingThisClassSoFar;
	public boolean isMyHWComplete;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.myName);
		System.out.println(aboutMe.myAge);
		System.out.println(aboutMe.myCarPayment);
		System.out.println(aboutMe.myWorkHours);
		System.out.println(aboutMe.myFreeTime);
		System.out.println(aboutMe.myPatience);
		System.out.println(aboutMe.myStressLevel);
		System.out.println(aboutMe.amILikingThisClassSoFar);
		System.out.println(aboutMe.isMyHomeWorkComplete);

	}

// Line 31-33 constructor declared.
	public AboutMe() {
		System.out.println(":------------ This is all about Myself ------------:");
	}

// Below is method implemented.
	public void aboutMe() {
		System.out.println("My name: " + myName + "\nMy age: " + myAge + " yrs");
		System.out.println("My car payment: $" + myCarPayment);
		System.out.println("My work hours: " + myWorkHours);
		System.out.println("My free time: " + myFreeTime);
		System.out.println("My patience: " + myPatience);
		System.out.println("My stress level: " + myStressLevel);
		System.out.println("Am I liking this class so far: " + amILikingThisClassSoFar);
		System.out.println("Is all my HW complete yet: " + isMyHomeWorkComplete);
	}

}
