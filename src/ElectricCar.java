public class ElectricCar extends ACar{
    private int maxRangeKm;
    private int batteryCapacity;
    private String fuelType;

    ElectricCar(String registrationNumber,String make, String model, int numberOfDoors, int batteryCapacity, int maxRangeKm) {
        super(registrationNumber,make,model,numberOfDoors);
        this.fuelType = "Electric";
        this.batteryCapacity = batteryCapacity;
        this.maxRangeKm = maxRangeKm;
    }

    @Override
    public int getRegistrationFee() {
        int kmPerLitre = getWhPrKm();
        if(kmPerLitre > 0 && kmPerLitre <= 5) {
            registrationFee = 10470;
        } else if(kmPerLitre > 5 && kmPerLitre <= 10) {
            registrationFee = 5500;
        } else if(kmPerLitre > 10 && kmPerLitre <= 15) {
            registrationFee = 2340;
        } else if(kmPerLitre > 15 && kmPerLitre <= 20) {
            registrationFee = 1050;
        } else if(kmPerLitre > 20) {
            registrationFee = 330;
        }
        return registrationFee;
    }
    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
       return maxRangeKm;
    };

    public int getWhPrKm() {
        return (int)(100/(getBatteryCapacityKWh()/91.25));
    };

    @Override
    public String toString() {
       return super.toString()+"\nFueltype: Electric\nMax Range: "+getMaxRangeKm()+" km.\nKm/l: "+getWhPrKm()+"\nRegistration fee: "+getRegistrationFee()+" kr.";
    }

}
