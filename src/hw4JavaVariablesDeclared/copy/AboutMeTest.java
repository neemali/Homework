package hw4JavaVariablesDeclared.copy;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // This constructor is initialized.
		aboutMe.aboutMe(); // This method is initialized.
//why was this not possible in the other class - aboutMe. 
		AboutMe tasneem = new AboutMe();
		tasneem.myName = "Tasneem Ali"; // This string is initialized.
		tasneem.myAge = 126; // This variable is initialized.
		tasneem.myCarPayment = 32765;
		tasneem.myWorkHours = 1000000000;
		tasneem.myFreeTime = -1000000000000l;
		tasneem.myPatience = 1.111111f;
		tasneem.myStressLevel = 9.99999999999;
		tasneem.amILikingThisClassSoFar = 'Y';
		tasneem.isMyHomeWorkComplete = false;

		AboutMe jade = new AboutMe();
		jade.myName = "Jade Ali";
		jade.myAge = 125;
		jade.myCarPayment = 32764;
		jade.myWorkHours = 10000000;
		jade.myFreeTime = -1000000000l;
		jade.myPatience = 1.11111f;
		jade.myStressLevel = 9.99999999;
		jade.amILikingThisClassSoFar = 'Y';
		jade.isMyHomeWorkComplete = false;

	}

}
