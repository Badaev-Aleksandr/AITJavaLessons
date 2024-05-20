package consultation;

import com.github.javafaker.Faker;

import java.util.Locale;

public class SalaryUtil {
    public double getNettoSalary(double bruttoSalary) {
        if (bruttoSalary < 2000) {
            return bruttoSalary;
        }
        if (bruttoSalary > 2000 && bruttoSalary < 3500) {
            return bruttoSalary - (bruttoSalary * 5) / 100;
        }
        if (bruttoSalary > 3500 && bruttoSalary < 5000) {
            return bruttoSalary - (bruttoSalary * 10) / 100;
        }
        return bruttoSalary - (bruttoSalary * 15) / 100;
    }

    public static class FakerUtil {

        public static void main(String[] args) {

            for (int i = 0; i<10;i++){
                createFakeStudent();
            }
        }


        public static Student createFakeStudent(){
            Faker faker = new Faker(new Locale("de-DE"));
            String firstname = faker.name().firstName();
            String secondName = faker.name().lastName();
            String address = faker.address().fullAddress();
            String phoneNumber = faker.phoneNumber().phoneNumber();

            Student studentOne = new Student(firstname, secondName, address, phoneNumber);
            System.out.println(studentOne.toString());
            return  studentOne;
        }
    }

    public static class Student {

        private String firstname;
        private  String secondName;
        private  String address;
        private String phoneNumber;


        public Student(String firstname, String secondName, String address, String phoneNumber) {
            this.firstname = firstname;
            this.secondName = secondName;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getSecondName() {
            return secondName;
        }

        public String getAddress() {
            return address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstname='" + firstname + '\'' +
                    ", secondName='" + secondName + '\'' +
                    ", address='" + address + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }
    }
}
