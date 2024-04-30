package lesson27.lesson;

public class Car extends Vehicle{
    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors +
                '}';
    }
}
