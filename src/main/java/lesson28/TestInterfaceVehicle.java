package lesson28;

public class TestInterfaceVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle eBike = new ElectricBike();
        car.start();
        eBike.start();
    }
}
