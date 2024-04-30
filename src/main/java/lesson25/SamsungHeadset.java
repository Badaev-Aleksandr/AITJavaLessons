package lesson25;

public class SamsungHeadset extends Headset{

    private boolean aiVersion;

    public SamsungHeadset(boolean waterproof, String color, ConnectionType connectionType, String brand, Size size, int soundLevel, boolean hasMicro, ChargingTyp chargingTyp, boolean aiVersion) {
        super(waterproof, color, connectionType, brand, size, soundLevel, hasMicro, chargingTyp);
        this.aiVersion = aiVersion;
    }

    public boolean isAiVersion() {
        return aiVersion;
    }

}
