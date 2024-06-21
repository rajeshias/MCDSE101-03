package Question_17;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create an Animal object
        Animal myBird = new Bird(); // Create a Bird object
        Animal myCat = new Cat(); // Create a Cat object

        myAnimal.makeSound();
        myBird.makeSound();
        myCat.makeSound();
    }
}
