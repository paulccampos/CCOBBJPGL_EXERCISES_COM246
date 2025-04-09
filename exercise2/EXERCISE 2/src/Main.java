//import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        DataScientist dsMe = new DataScientist("John", null, 0);
        System.out.println(dsMe.name +" works as a " + dsMe.getWork() + " and he earns " + dsMe.getSalary());

        Researcher rcMe = new Researcher("Jane", null, 0);
        System.out.println(rcMe.name +" works as a " + rcMe.getWork() + " and he earns " + rcMe.getSalary());

    }
}
