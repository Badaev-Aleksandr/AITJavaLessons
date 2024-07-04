package lesson46;

public class StudentManager {
    public static void main(String[] args) {
        Course<Student> matheCourse = new Course<>();
        matheCourse.addStudent(new Student("Mustermann"));
        matheCourse.addStudent(new Student("Fritz"));

        System.out.println(matheCourse);
    }
}
