package lesson26.task02;

public class CosmeticProductTest {
    public static void main(String[] args) {
        Lipstick lipstick = new Lipstick("Помада","Live",99.99,"braun");
        System.out.println(lipstick);
        lipstick.apply();
        Mascara mascara = new Mascara("Ресницы","avea",55.99,true);
        System.out.println(mascara);
        mascara.apply();
    }
}
