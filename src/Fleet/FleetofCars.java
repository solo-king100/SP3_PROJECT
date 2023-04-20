package Fleet;

import Car.Car;

import java.util.ArrayList;

public class FleetofCars {

    private ArrayList<Car>fleet;
    public FleetofCars() {
        fleet= new ArrayList();

    }

        public void addCar (Car car){
            fleet.add(car);
        }

        public int getTotalRegistrationFeeForFleet () {
            int totalRegistration = 0;
            for (Car car : fleet) {
                totalRegistration += car.getRegistrationFee();
            }
            return totalRegistration;
        }

        @Override
        public String toString () {
            StringBuilder sb = new StringBuilder();
            for (Car car : fleet) {
                sb.append(car.toString()).append("\n");
            }
            return sb.toString();
        }

    }


