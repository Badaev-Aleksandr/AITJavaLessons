package homework31;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    private Student student;

    @BeforeEach
    public void setUp(){
        student = new Student();
    }


    @Test
    @DisplayName("Проверка правильность работы метода на списке с разными данными")
    void studentsListTestPositive(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 99));
        students.add(new Student("Lisa", 80));
        students.add(new Student("Sven", 85));
        students.add(new Student("David", 76));

        ArrayList<Student> filteredStudents = student.filterStudentsAboveScore(students,75);

        assertEquals(4,filteredStudents.size());
        assertEquals("Alex", filteredStudents.get(0).getStudentName());
        assertEquals("Lisa", filteredStudents.get(1).getStudentName());
        assertEquals("Sven", filteredStudents.get(2).getStudentName());
        assertEquals("David", filteredStudents.get(3).getStudentName());



    }
}
