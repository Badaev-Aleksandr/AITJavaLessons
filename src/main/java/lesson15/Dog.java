package lesson15;

public class Dog {
    private String name;
    private String color;

    private String breed;
    private boolean canBellt;
    private boolean serviceDog;

    public Dog(String name, String color, String breed, boolean canBellt, boolean serviceDog) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.canBellt = canBellt;
        this.serviceDog = serviceDog;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isCanBellt() {
        return canBellt;
    }

    public boolean isServiceDog() {
        return serviceDog;
    }
}


