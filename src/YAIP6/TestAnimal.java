package YAIP6;

public class TestAnimal {
    public static void main(String[] args) {
        // Test de la classe Cat
        Cat cat = new Cat("Kitty");
        System.out.print("Cat greets: ");
        cat.greets(); // Devrait afficher "Meow"

        // Test de la classe Dog
        Dog dog = new Dog("Buddy");
        System.out.print("Dog greets: ");
        dog.greets(); // Devrait afficher "Woof"

        // Test de Dog greets un autre Dog
        Dog anotherDog = new Dog("Charlie");
        System.out.print("Dog greets another Dog: ");
        dog.greets(anotherDog); // Devrait afficher "Woooof"

        // Test de la classe BigDog
        BigDog bigDog = new BigDog("Max");
        System.out.print("BigDog greets: ");
        bigDog.greets(); // Devrait afficher "Wooow"

        // Test de BigDog greets un Dog
        System.out.print("BigDog greets a Dog: ");
        bigDog.greets(dog); // Devrait afficher "Wooooow"

        // Test de BigDog greets un autre BigDog
        BigDog anotherBigDog = new BigDog("Rocky");
        System.out.print("BigDog greets another BigDog: ");
        bigDog.greets(anotherBigDog); // Devrait afficher "Wooooooooow"
    }
}

