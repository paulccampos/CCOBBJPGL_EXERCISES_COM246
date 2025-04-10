public class Hybrid implements Electric, InternalCombustion {
    @Override
    public void chargebattery(){
        System.out.println("Charging battery");
    }

    @Override
    public void refillgas(){
        System.out.println("Refueling gas");
    }
}
