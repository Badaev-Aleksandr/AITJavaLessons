package lesson27.homework;

public class FinancialDirector extends Director{
    public FinancialDirector(String name, String position, int experienceYears) {
        super(name, position, experienceYears);
    }
    public void work(){
        System.out.println(getName() + " Financial director");
    }
}
