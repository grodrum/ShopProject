package ua.javabegin.training.java2.goods;

public class ElectronicDevice extends ElectricDevice {
    private String chipVendor;
    private boolean hasSensor;
    private boolean hasWiFi;
    private boolean hasBluetooth;

    public void powerOn() {
        System.out.println("Powering on");
    }

    public void powerOff() {
        System.out.println("Powering off");
    }

    public String getChipVendor() {
        return chipVendor;
    }

    public void setChipVendor(String chipVendor) {
        this.chipVendor = chipVendor;
    }

    public boolean isHasSensor() {
        return hasSensor;
    }

    public void setHasSensor(boolean hasSensor) {
        this.hasSensor = hasSensor;
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public void setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }
}
