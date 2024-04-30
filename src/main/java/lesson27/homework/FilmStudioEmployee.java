package lesson27.homework;

public class FilmStudioEmployee {
    private String name;
    private String position;
    private int experienceYears;

    public FilmStudioEmployee(String name, String position, int experienceYears) {
        this.name = name;
        this.position = position;
        this.experienceYears = experienceYears;
    }

    public void work() {
        System.out.println(name + " works on her current task");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "FilmStudioEmployee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
