public class App {
    public static void main(String[] args) {
        Car myCar = new Car("10kWh", 6);
        System.out.println("Battery: " + myCar.getBattery());
        System.out.println("Cylinder: " + myCar.getCylinder());
    }
}
