package hw7Inheritance;

public class AnimalTest {    //Step11

	public static void main(String[] args) {
	
		Animal animal = new Animal();   //Instantiate
		animal.animalInfo();
		
		System.out.println("\n-----------------------------------------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		
		System.out.println("\n------------------------------------------------------\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		
		System.out.println("\n-------------------------------------------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		
		System.out.println("\n--------------------------------------------------------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		
		System.out.println("\n--------------------------------------------------------\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		
		System.out.println("\n---------------------------------------------------------\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		
		System.out.println("\n---------------------------------------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		
		System.out.println("\n----------------------------------------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		
}
}
//Step13
//Single Inheritance:
//Multilevel Inheritance: 
//Hierarchical Inheritance: 

