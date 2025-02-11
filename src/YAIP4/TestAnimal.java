package YAIP4;

public class TestAnimal {
	public static void main(String[] args) {
		// Test for Animal
		Animal animal = new Animal("Generic Animal");
		System.out.println(animal);  // Expected: Animal[name=Generic Animal]

		// Test for Mammal
		Mammal mammal = new Mammal("Mammal");
		System.out.println(mammal);  // Expected: Mammal[Animal[name=Mammal]]

		// Test for Cat
		Cat cat = new Cat("Whiskers");
		System.out.println(cat);     // Expected: Cat[Mammal[Animal[name=Whiskers]]]
		cat.greets();                // Expected: Meow

		// Test for Dog
		Dog dog1 = new Dog("Rex");
		Dog dog2 = new Dog("Max");

		System.out.println(dog1);    // Expected: Dog[Mammal[Animal[name=Rex]]]
		dog1.greets();               // Expected: Woof
		dog1.greets(dog2);           // Expected: Wooof
	}
}

