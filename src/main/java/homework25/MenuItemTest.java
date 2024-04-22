package homework25;


public class MenuItemTest {
    public static void main(String[] args) {
        OrderStatus orderStatus = OrderStatus.PENDING;

        MenuItem manti = new MenuItem("Manti",MenuItemType.DISH);
        MenuItem kompot = new MenuItem("Kompot",MenuItemType.DRINK);
        MenuItem pizza = new MenuItem("Pizza", MenuItemType.DISH);
        MenuItem borsh = new MenuItem("Borsh",MenuItemType.DISH);
        System.out.println(manti);
        System.out.println(kompot);
        System.out.println(pizza);
        System.out.println(borsh);

        System.out.println(orderStatus.name() + " " + orderStatus.getDescription());

        System.out.println(orderStatus.canCancel());
    }
}
