package hw8Abstraction;

public abstract class MedicalSchool {

	//Abstract method
	public abstract void anatomyLab(); 
	
	//Non abstract method
	public void biochemistryLab() {
		System.out.println("This is the non abstract method, that is implented.");
		}
	
	//Default Constructor- declared
			public MedicalSchool() {   
				System.out.println("A constructor can be declared within an Abstract Class. ");
			}
			
		
	}
	

