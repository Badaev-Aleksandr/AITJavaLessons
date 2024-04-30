package lesson27.homework;

public class CameraOperator extends FilmStudioEmployee {
    public CameraOperator(String name, String position, int experienceYears) {
        super(name, position, experienceYears);
    }

    public void operatorCamera() {
        System.out.println(getName() + " is operating camera.");
    }

    @Override
    public String toString() {
        return "CameraOperator{}" + super.toString();
    }
    @Override
    public void work() {
        System.out.println(getName() + " is making light");
    }
}
