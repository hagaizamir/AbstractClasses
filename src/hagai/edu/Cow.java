package hagai.edu;

public class Cow extends Animal {
    String sound;

    public Cow(Food food, String name, String sound) {
        super(food, name);
        this.sound = sound;

    }

    public void makeSound() {
        System.out.println(getName() + " sounds " + sound);
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,sound='" + sound + '\'' +
                '}';
    }
}
   