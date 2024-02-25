package hw6Methods;

public class FullName {

	public String fName = "Tasneem";
	public String lName = "Ali";
	
	public String fullName() {
		String fullName = fName + " " + lName;
		System.out.println("Family Member: " +fullName);
		return fullName; 
			}
	
	public static void main(String[] args) {
		FullName fullName = new FullName();
		fullName.fullName();
	}
	
}
