package hw4JavaVariablesInitialized;

//byte, short, int, long, float, double, char and boolean
public class AboutMe {
	public boolean isMyHomeWorkComplete;
//	The above variable is declared.
	public String myName = "Tasneem";
	public byte myAge = 126;
//	The above variable is initialized. 
	public short myCarPayment = 32765;
	public int myWorkHours = 1000000000;
	public long myFreeTime = -1000000000000l;
	public float myPatience = 1.111111f;
	public double myStressLevel = 9.99999999999999;
	public char amILikingThisClassSoFar = 'Y';
	public boolean isMyHWComplete = false;

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

	public AboutMe() {
		System.out.println(":------------ This is all about Myself ------------:");
	}
// Below is method implemented.
	public void aboutMe(){
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
