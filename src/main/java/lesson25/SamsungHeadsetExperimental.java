package lesson25;

public class SamsungHeadsetExperimental extends Headset {
        private int stepCount;

    public SamsungHeadsetExperimental(boolean waterproof, String color, ConnectionType connectionType, String brand, Size size, int soundLevel, boolean hasMicro, ChargingTyp chargingTyp, int stepCount) {
        super(waterproof, color, connectionType, brand, size, soundLevel, hasMicro, chargingTyp);
        this.stepCount = stepCount;
    }

    public int getStepCount() {
        return stepCount;
    }
}
