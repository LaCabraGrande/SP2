//SP-2
// Lars Grønberg
// cph-lg195@cphbusiness.dk
public class Main {

    public static void main(String[] args) {
      FleetOfCars fleet = new FleetOfCars();
      fleet.addCar(new GasolineCar("EA 23456", "Audi", "Q2", 5, 16));
      fleet.addCar(new GasolineCar("EA 23456", "Volvo", "V60 2.0", 5, 12));
      fleet.addCar(new GasolineCar("EA 23456","Mercedes", "A 200 Sedan", 5, 17));
      fleet.addCar(new DieselCar("QW 39456",  "Audi", "A5 Sportback", 5, 19, true));
      fleet.addCar(new DieselCar("HJ 17456", "Volvo", "XC60", 5, 19, false));
      fleet.addCar(new DieselCar("BN 76456",  "Mercedes", "GLB 220 d", 5, 18, true));
      fleet.addCar(new ElectricCar("CF 93456", "Tesla","Y",5,82, 533));
      fleet.addCar(new ElectricCar("CF 93456", "Volvo","C40 Recharge",5,179, 579));
      fleet.addCar(new ElectricCar("CF 93456", "Mercedes","EQA 250+",5,140, 552));

      fleet.printFleet();
      System.out.println("\nTotal registration fee for the fleet of "+fleet.getSize()+" cars is: "+fleet.getTotalRegistrationFeeForFleet()+" kr.");
    }
}