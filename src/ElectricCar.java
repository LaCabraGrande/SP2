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
        if(getKmPrLitre() > 0 && getKmPrLitre() <= 5) {
            registrationFee = 10470;
        } else if(getKmPrLitre() > 5 && getKmPrLitre() <= 10) {
            registrationFee = 5500;
        } else if(getKmPrLitre() > 10 && getKmPrLitre() <= 15) {
            registrationFee = 2340;
        } else if(getKmPrLitre() > 15 && getKmPrLitre() <= 20) {
            registrationFee = 1050;
        } else if(getKmPrLitre() > 20) {
            registrationFee = 330;
        }
        return registrationFee;
    }
    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }
    public int getMaxRangeKm() {
       return maxRangeKm;
    }
    public int getWhPrKm() {
        return ((getBatteryCapacityKWh()*1000)/getMaxRangeKm());
    }
    public int getKmPrLitre() {
        return (int)(100/(getWhPrKm()/91.25));
    }
    @Override
    public String toString() {
       return super.toString()+"\nKm/l: "+getKmPrLitre()+"\nMax Range: "+getMaxRangeKm()+" km.\nWh/Km: "+getWhPrKm()+"\nFueltype: Electric\nRegistration fee: "+getRegistrationFee()+" kr.";
    }

}
