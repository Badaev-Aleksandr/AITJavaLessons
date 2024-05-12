package homework31;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String studentName;
    private int score;
    private HashMap<String, Integer> students = new HashMap<>();

    //5. Тестирование работы с коллекциями: Создайте тест для метода, который принимает список студентов и возвращает
    // список студентов с оценкой выше 75. Тест должен проверять правильность работы метода на списке с разными данными.

    public  ArrayList<Student> filterStudentsAboveScore(ArrayList<Student> students, int score) {
        ArrayList<Student> filteredStudents = new ArrayList<>();
        for  (Student student : students) {
            if (student.getScore() > score) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    public Student(String studentName, int grade) {
        this.studentName = studentName;
        this.score = grade;
    }

    public Student() {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public HashMap<String, Integer> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", grade=" + score +
                '}';
    }
}
