package lesson27;

public class MenuItemTest {
    public static void main(String[] args) {
        OrderStatus orderStatus = OrderStatus.PENDING;

        MenuItem pizza = new MenuItem("Pizza", MenuItemType.DISH);
        MenuItem pelmeni = new MenuItem("Pelmeni", MenuItemType.DISH);
        MenuItem airan = new MenuItem("Airan", MenuItemType.DRINK);
        System.out.println(pizza.toString());
        System.out.println(pelmeni.toString());
        System.out.println(airan.toString());

        System.out.println(orderStatus.name() + " " + orderStatus.getDescription());

        System.out.println(orderStatus.canCancel());
    }
}
