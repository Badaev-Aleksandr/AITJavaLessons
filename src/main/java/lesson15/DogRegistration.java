package lesson15;

public class DogRegistration {


    public static void main(String[] args) {
        Dog dogMops = new Dog("Hatiko", "Black", "Mops", false, false);
        Dog dogBulldog = new Dog("Max","White","Bully",false,true);


        Dog[] registrate = {dogBulldog, dogMops};
        for (Dog dog: registrate){
            System.out.println(dog.getName());
        }

        //System.out.println("Color: " + dogMops.getColor());
        //System.out.println("Color: " + dogBulldog.getColor());
    }
}

