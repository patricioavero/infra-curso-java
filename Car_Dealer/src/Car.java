public class Car {
    // Attributes
    private String licensePlate;
    private Brands brandName;
    private String modelName;
    private Integer odometer;

    private String vin;

    // Constructor
    public Car(String vin, Brands brandName, String modelName, Integer odometer) {
        this.vin = vin;
        this.brandName = brandName;
        this.modelName = modelName;
        this.odometer = odometer;
    }

    // Getters and setters
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Brands getBrandName() {
        return brandName;
    }

    public void setBrandName(Brands brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getOdometer() {
        return odometer;
    }

    public void setKms(Integer Odometer) {
        this.odometer = odometer;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    // toString
    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                "licensePlate='" + licensePlate + '\'' +
                ", brandName=" + brandName +
                ", modelName='" + modelName + '\'' +
                ", odometer=" + odometer +
                '}';
    }
}
