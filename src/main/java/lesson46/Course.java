package lesson46;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends Student> {
    private List<Student> students = new ArrayList<>();

    public void addStudent(T student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "students=" + students +
                '}';
    }
}
