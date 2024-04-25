package homework26;

public class SoundEngineer extends FilmStudioEmployee{
    public SoundEngineer(String name, String position, int experienceYears) {
        super(name, position, experienceYears);
    }
    public void recordSound(){
        System.out.println(getName() + " record sound");
    }

    @Override
    public String toString() {
        return "SoundEngineer{} " + super.toString();
    }

    @Override
    public void work() {

        System.out.println(getName() + " work checks sound");
    }
}
