public class GasolineCar extends AFuelCar {
    private String fuelType;

    GasolineCar(String registrationNumber,String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber,make,model,numberOfDoors,kmPrLitre);
        this.fuelType = getFuelType();
        this.registrationFee = getRegistrationFee();
    }

    @Override
    public int getRegistrationFee() {
        int kmPerLitre = getKmPrLitre();
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

    @Override
    public String toString() {
        return super.toString()+"Fueltype: "+getFuelType()+"\nRegistration fee: "+getRegistrationFee()+" kr.";
    }
    @Override
    public String getFuelType() {
        return "Gasoline";
    }

}
