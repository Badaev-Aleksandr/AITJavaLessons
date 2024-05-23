package homework34;

public class Animal extends AnimalsActions {
    private String name;
    private int energy = 100;

    public Animal(String name) {
        this.name = name;
    }
   public Animal(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                '}';
    }
}
