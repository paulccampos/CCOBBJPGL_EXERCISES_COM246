public class Car implements Electric, InternalCombustion, Hybrid {
    private String battery;
    private int cylinder;

    public Car(String batt, int cyl) {
        this.battery = batt;
        this.cylinder = cyl;
    }

    @Override
    public String getBattery() {
        return battery;
    }

    @Override
    public int getCylinder() {
        return cylinder;
    }
}
