package lesson28;

public class ElectricBike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Electric Bike is running");
    }

    @Override
    public void stop() {
        System.out.println("Electric Bike is stopped");
    }
}
