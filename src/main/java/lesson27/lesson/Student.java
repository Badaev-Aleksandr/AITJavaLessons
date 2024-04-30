package lesson27.lesson;

public class Student extends Person{
    private int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                '}';
    }
    @Override
    public void display() {
        System.out.println("Name: " + getName() + " " + " Student ID: " +  getStudentId());
    }
}
