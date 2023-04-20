//Placed all classes for Car and there under, in a package Car,to be able to import.
//Fleet placed in a package "Fleet"

import Car.DieselCar;
import Car.ElectricCar;
import Car.GasolinCar;
import Fleet.FleetofCars;

public class Main {
    public static void main(String[] args) {
        FleetofCars fleet = new FleetofCars();

        // Add cars to the fleet
        DieselCar car1 = new DieselCar("DK9982", "Mercedes Benz", "GLC-Coupe", 4, 25, true);

        GasolinCar car2 = new GasolinCar("AK0083", "Koenigsegg", "Regera", 2, 13);

        ElectricCar car3 = new ElectricCar("UG1919", "Tesla", "Model X", 4, 99, 359, 40);

        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);

        // Print the fleet of cars just added

        System.out.println(fleet);

        // Total registration fee for fleet

        int totalRegistrationFee = fleet.getTotalRegistrationFeeForFleet();
        System.out.println("Total Registration fee for fleet: " + totalRegistrationFee + " DKK");
    }
}
