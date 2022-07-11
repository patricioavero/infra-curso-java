public class Vehiculo {

    private String licensePlate;
    private Brands brandName;
    private String modelName;
    private Integer odometer;

    public Vehiculo(String licensePlate, Brands brandName, String modelName, Integer odometer) {
        this.licensePlate = licensePlate;
        this.brandName = brandName;
        this.modelName = modelName;
        this.odometer = odometer;
    }

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

    public void setOdometer(Integer odometer) {
        this.odometer = odometer;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Tipo= " + this.getClass().getSimpleName() + '\'' +
                "licensePlate='" + licensePlate + '\'' +
                ", brandName=" + brandName +
                ", modelName='" + modelName + '\'' +
                ", odometer=" + odometer +
                '}';
    }
}
