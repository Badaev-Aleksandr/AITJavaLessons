package homework26;

public class Director extends FilmStudioEmployee{
    public Director(String name, String position, int experienceYears) {
        super(name, position, experienceYears);
    }
    public void direct(){
        System.out.println(getName() + " is a director");
    }
    @Override
    public void work(){
        super.work();
        System.out.println(getName() + " makes Casting");
    }

    @Override
    public String toString() {
        return "Director{} " + super.toString();
    }
}
