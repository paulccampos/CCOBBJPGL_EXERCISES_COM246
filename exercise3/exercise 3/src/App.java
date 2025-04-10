public class App {
    public static void main(String[] args) {
        HybridVehicle car1 = new Sedan();
        HybridVehicle car2 = new Pickup();

        car1.carname = "BMW Sedan";
        car2.carname = "Raptor";

        car1.chargebattery();
        car1.refillgas();

        car2.chargebattery();
        car2.refillgas();

        System.out.println(car1.carname);
        System.out.println(car2.carname);

        Wash c1 = new Wash();

        c1.wash(car1);

        c1.wash(car2);

    }
}
