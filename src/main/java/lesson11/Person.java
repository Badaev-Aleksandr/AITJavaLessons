package lesson11;

public class Person {

    private int age = 30;
    private String name = "Max";

    private String pass = "Deutschland";

    private String colorOfEye = "black";

    private String sex = "male";

    protected int getAge() { //protected Видит только в папке
        return age;
   }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public String getColorOfEye() {
        return colorOfEye;
    }

    public String getSex() {
        return sex;
    }
}
