public abstract class ACar implements Car {
    String registrationNumber;
    final String make;
    final String model;
    final int numberOfDoors;
    protected int registrationFee;

    ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
     }
    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    @Override
    public String toString() {
        return "\nBrand: "+getMake()+"\nModel: "+getModel()+"\nRegistration Number: "+getRegistrationNumber()+"\nNumber Of Doors: "+getNumberOfDoors();
    }

}
