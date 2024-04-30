package lesson26.task;

public class Student extends Person{
    private String educationTime;
    private double averageDegree;

    public Student(String name, int age, String educationTime, double averageDegree) {
        super(name, age);
        this.educationTime = educationTime;
        this.averageDegree = averageDegree;
    }

    public String getEducationTime() {
        return educationTime;
    }

    public double getAverageDegree() {
        return averageDegree;
    }

    @Override
    public String toString() {
        return "Student-->" + "Name:" + getName() + " age: " + getAge() + " " +
                "educationTime='" + educationTime + '\'' +
                ", averageDegree=" + averageDegree +
                '}';
    }
}
