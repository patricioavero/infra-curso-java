public class Moto extends Vehiculo {

    //atributos
    private Integer cilindrada;

    public Moto(String licensePlate, Brands brandName, String modelName, Integer odometer, Integer cilindrada) {
        super(licensePlate, brandName, modelName, odometer);
        this.cilindrada = cilindrada;
    }

    //metodos


    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }
}
