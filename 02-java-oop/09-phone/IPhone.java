public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    public String ring() {
        return this.ringTone;
    }
    public String unlock() {
        return "Unlocking via finger print.";
    }
    public void displayInfo() {
        System.out.println("iPhone " + this.versionNumber + "from" + this.carrier);
    }
}