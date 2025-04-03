public class Car implements InternalCombustion, Electric,Hybrid {

    String battery;
    int cylinder;

    Car(String batt){
        this.battery = "10kwh";
        this.electric = true;
        this.gas = false;
    }

    public default int getCylinder(){
        return cylinder;
    }

    public default String getBattery(){
        return battery;
    }
}
