public class Car extends Vehiculo {
    private String vin;

    public Car(String licensePlate, Brands brandName, String modelName, Integer odometer, String vin) {
        super(licensePlate, brandName, modelName, odometer);
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
