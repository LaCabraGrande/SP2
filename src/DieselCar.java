public class DieselCar extends AFuelCar {
    private boolean particleFilter;
    private final String fuelType;

    DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber,make,model,numberOfDoors,kmPrLitre);
        this.fuelType = getFuelType();
        this.registrationFee = getRegistrationFee();
        this.particleFilter = particleFilter;
    }
    @Override
    public int getRegistrationFee() {
        int kmPerLitre = getKmPrLitre();
        if(kmPerLitre > 0 && kmPerLitre <= 5) {
            registrationFee = 10470+15260;
        } else if(kmPerLitre > 5 && kmPerLitre <= 10) {
            registrationFee = 5500+2770;
        } else if(kmPerLitre > 10 && kmPerLitre <= 15) {
            registrationFee = 2340+1850;
        } else if(kmPerLitre > 15 && kmPerLitre <= 20) {
            registrationFee = 1050+1390;
        } else if(kmPerLitre > 20) {
            registrationFee = 330+130;
        }
        if(!particleFilter) {
            registrationFee += 1000;
        }
        return registrationFee;
    }
    public boolean hasParticleFilter() {
        return particleFilter;
    }
    @Override
    public String toString() {
        String s = super.toString()+"Fueltype: "+getFuelType()+"\nRegistration fee: "+getRegistrationFee()+" kr.\nParticle filter: ";
        if(hasParticleFilter()) {
            s += "yes";
        } else {
            s += "no";
        }
        return s;
    }
    @Override
    public String getFuelType() {
        return "Diesel";
    }








}
