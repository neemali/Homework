package hw3JavaVariables;

public class AboutMeTest {
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
		System.out.println(":)--------------------------------------------(:");
		System.out.println("My name: " + aboutMe.myName + "\nMy age: " + aboutMe.myAge + " yrs");
		System.out.println("My car payment: $" + aboutMe.myCarPayment);
		System.out.println("My work hours: " + aboutMe.myWorkHours);
		System.out.println("My free time: " + aboutMe.myFreeTime);
		System.out.println("My patience: " + aboutMe.myPatience);
		System.out.println("My stress level: " + aboutMe.myStressLevel);
		System.out.println("Am I liking this class so far: " + aboutMe.amILikingThisClassSoFar);
		System.out.println("Is all my HW complete yet: " + aboutMe.isMyHomeWorkComplete);
	}

}
