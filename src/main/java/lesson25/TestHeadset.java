package lesson25;

public class TestHeadset {
    public static void main(String[] args) {
        AppleHeadset appleHeadset = new AppleHeadset(true,"white",ConnectionType.WIRELESS,"Apple",Size.SMALL,70,true,ChargingTyp.INDUCTION,"1.2");
        System.out.println(appleHeadset.getChargingTyp());
    }
}
