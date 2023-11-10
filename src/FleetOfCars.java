import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet;

    public FleetOfCars() {
        fleet = new ArrayList<>();
    }
    public void addCar(Car car){
        fleet.add(car);
    }
    public int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFeeForFleet = 0;
        for(Car c: fleet) {
            totalRegistrationFeeForFleet += c.getRegistrationFee();
        }
        return totalRegistrationFeeForFleet;
    }
    public void printFleet() {
        for (Car car : fleet) {
            System.out.println(car.toString());
        }
    }
    public void printTotalRegistrationFee() {
        System.out.println("\n\nTotal registration fee for the fleet of "+getSize()+" cars is: "+getTotalRegistrationFeeForFleet()+" kr.");
    }
    public int getSize() {
        return fleet.size();
    }
    @Override
    public String toString() {
        String s = "";
        for(Car c: fleet) {
          s = c.toString();
        }
        return s;
    }
}
