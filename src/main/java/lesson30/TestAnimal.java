package lesson30;

public class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();
        dog.eat();
        Animal cat = new Cat();
        cat.makeSound();
        cat.sleep();
        cat.eat();
        boolean check = cat.equals(dog);
        System.out.println(check);
    }
}
