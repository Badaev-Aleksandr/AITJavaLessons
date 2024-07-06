package consultation;

public class StaticExamplesJava {
    public static int age = 35;

    public double salary = 3000;

    public static void printAge() {
        System.out.println(age);
    }

    static {
        System.out.println("static block");
    }
}
