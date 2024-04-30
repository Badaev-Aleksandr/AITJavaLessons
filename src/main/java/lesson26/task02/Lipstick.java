package lesson26.task02;
/*
- Создайте классы `Lipstick` и `Mascara`, которые наследуют от `CosmeticProduct`:
  - `Lipstick` добавляет:
    - Поле: `color` (цвет помады)
    - Переопределяет метод `apply()` для вывода информации о нанесении помады.
  - `Mascara` добавляет:
    - Поле: `volumeEffect` (эффект увеличения объема ресниц)
    - Переопределяет метод `apply()` для вывода информации о нанесении туши.
 */
public class Lipstick extends CosmeticProduct{
    private String color;

    public Lipstick(String productName, String brand, double price, String color) {
        super(productName, brand, price);
        this.color = color;
    }
    @Override
    void apply(){
        super.apply();
        System.out.println("Помаду на губы");
    }

    @Override
    public String toString() {
        return "Lipstick{" +
                "color='" + color + '\'' + super.toString() +
                '}';
    }
}
