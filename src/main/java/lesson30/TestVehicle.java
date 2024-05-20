package lesson30;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car("Audi");
        Vehicle bike = new Motorcycle("BMW");

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}
