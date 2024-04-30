package lesson25;

public class Headset {
    private boolean waterproof;
    private String color;
    private ConnectionType connectionType;
    private String brand;
    private Size size;
    private int soundLevel;
    private boolean hasMicro;
    private ChargingTyp chargingTyp;

    public Headset(boolean waterproof, String color, ConnectionType connectionType, String brand, Size size, int soundLevel, boolean hasMicro, ChargingTyp chargingTyp) {
        this.waterproof = waterproof;
        this.color = color;
        this.connectionType = connectionType;
        this.brand = brand;
        this.size = size;
        this.soundLevel = soundLevel;
        this.hasMicro = hasMicro;
        this.chargingTyp = chargingTyp;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public boolean isHasMicro() {
        return hasMicro;
    }

    public void setHasMicro(boolean hasMicro) {
        this.hasMicro = hasMicro;
    }

    public ChargingTyp getChargingTyp() {
        return chargingTyp;
    }

    public void setChargingTyp(ChargingTyp chargingTyp) {
        this.chargingTyp = chargingTyp;
    }
}
