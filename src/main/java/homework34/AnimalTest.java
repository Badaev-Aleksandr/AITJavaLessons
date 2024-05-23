package homework34;

public class AnimalTest {
    public static void main(String[] args) {
        Animal manky = new Animal("Manky");
        Animal lowe = new Animal("Lowe");

        manky.eat(manky);
        manky.eat(manky);
        manky.play(manky);
        manky.play(manky);
        manky.play(manky);
        manky.play(manky);
        lowe.play(lowe);
        lowe.play(lowe);
        lowe.play(lowe);

    }
}
