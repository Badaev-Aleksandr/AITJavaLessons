package lesson26;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I'm bird, I'm hungry ");
    }
}
