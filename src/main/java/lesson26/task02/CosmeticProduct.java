package lesson26.task02;
/*
Создайте базовый класс `CosmeticProduct`, который будет содержать общие атрибуты и
методы для различных косметических продуктов.
- Класс `CosmeticProduct` должен содержать:
  - Поля: `productName`, `brand`, `price`
  - Метод `apply()`, который выводит информацию о том, как применять продукт.
- Создайте классы `Lipstick` и `Mascara`, которые наследуют от `CosmeticProduct`:
  - `Lipstick` добавляет:
    - Поле: `color` (цвет помады)
    - Переопределяет метод `apply()` для вывода информации о нанесении помады.
  - `Mascara` добавляет:
    - Поле: `volumeEffect` (эффект увеличения объема ресниц)
    - Переопределяет метод `apply()` для вывода информации о нанесении туши.
#### Требования
Реализуйте эти классы, используя концепцию наследования, и создайте метод `main`,
где вы создадите и использовать экземпляры этих продуктов.
 */
public class CosmeticProduct {
    private String productName;
    private String brand;
    private double price;

    public CosmeticProduct(String productName, String brand, double price) {
        this.productName = productName;
        this.brand = brand;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
    void apply(){
        System.out.println("Нанесите косметику ");
    }

    @Override
    public String toString() {
        return "CosmeticProduct{" +
                "productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
