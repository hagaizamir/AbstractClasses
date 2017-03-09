package hagai.edu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cow cow = new Cow(Animal.Food.GRASS, "Milka", "Moo");

        cow.eat();
        cow.makeSound();
        System.out.println(cow);
    }
}

