package lesson26.task02;
/*
- `Mascara` добавляет:
    - Поле: `volumeEffect` (эффект увеличения объема ресниц)
    - Переопределяет метод `apply()` для вывода информации о нанесении туши.
 */
public class Mascara extends CosmeticProduct{
    private boolean volumeEffectv;

    public Mascara(String productName, String brand, double price, boolean volumeEffectv) {
        super(productName, brand, price);
        this.volumeEffectv = volumeEffectv;
    }

    public boolean getVolumeEffectv() {
        return volumeEffectv;
    }

    @Override
    void apply(){
        super.apply();
        System.out.println("Туш на Ресницы");
    }

    @Override
    public String toString() {
        return "Mascara{" +
                "volumeEffectv='" + volumeEffectv + '\'' + super.toString() +
                '}';
    }
}
