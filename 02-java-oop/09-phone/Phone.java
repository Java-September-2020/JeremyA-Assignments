public abstract class Phone {
    public String versionNumber;
    public int batteryPercentage;
    public String carrier;
    public String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    public abstract void displayInfo();

    public void setVersionNumber(String number) {
        this.versionNumber = number;
    }
    public String getVersionNumber(){
        return this.versionNumber;
    }
    public void setBatteryPercentage(int battery) {
        this.batteryPercentage = battery;
    }
    public int getBatteryPercentage(){
        return this.batteryPercentage;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public String getCarrier() {
        return this.carrier;
    }
    public void setRingTone(String tone) {
        this.ringTone = tone;
    }
    public String getRingTone(){
        return this.ringTone;
    }
}