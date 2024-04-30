package lesson25;

public class AppleHeadset extends Headset {

    private String softwareVersion;

    public AppleHeadset(boolean waterproof, String color, ConnectionType connectionType, String brand, Size size, int soundLevel, boolean hasMicro, ChargingTyp chargingTyp, String softwareVersion) {
        super(waterproof, color, connectionType, brand, size, soundLevel, hasMicro, chargingTyp);
        this.softwareVersion = softwareVersion;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }
}
