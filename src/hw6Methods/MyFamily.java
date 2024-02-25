package hw6Methods;

public class MyFamily {
	
	// global or class variable
	public int child1Age = 3;
	public int child2Age = 2;
	public int child3Age = 2;

	public int myFamily() {
		int total = child1Age+child2Age+child3Age;
		System.out.println("The sum of my children's age is: "+total);
		return total;
	}
	
	public static void main(String[] args) {
		
   MyFamily myObj = new MyFamily();
   myObj.myFamily();
	
	}
	}

