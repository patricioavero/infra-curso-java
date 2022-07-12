import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Create a new dealer
        Dealer dealer = new Dealer();

        //Add the already created car (car1) to the Dealer's car inventory.
        dealer.add(new Car("DASADSSA1", Brands.VOLKSWAGEN, "Polo", 162000,"vin1"));
        dealer.add(new Car("QQWE", Brands.MERCEDESBENZ, "1114", 1000,"vin2"));
        dealer.add(new Car("ZXCZXC", Brands.FIAT, "UNO", 9999999,"vin3"));
        dealer.add(new Car("GHJGHJ", Brands.BMW, "Pato", 162000,"vin4"));
        dealer.add(new Car("TYUTYU", Brands.FIAT, "Fitito", 132000,"vin5"));
        dealer.add(new Moto("TYUTYU", Brands.FIAT, "Zanella", 132000,1000));

        //dealer.listAll(Vehiculo.class);

        dealer.listall2(Moto.class);


        // Show all the cars from the Dealer
        //dealer.showCars();

        // Print the car that has been found based on its VIN
//        System.out.println(dealer.findCar2(car -> car.getVin().equals("DASDAF1231")));
        // Print the car that has been found based on its model name.
//        System.out.println(dealer.findCar2(car -> car.getBrandName().equals(Brands.FIAT)));
//        Use predicate and declarative mood.
//        List<Car> cars_found  = (dealer.findCar2(car -> car.getBrandName().equals(Brands.FIAT)));

//        List<Car> cars_found  = (dealer.findCar(Brands.FIAT));


        Scanner scanner = new Scanner(System.in);
        int opcion = 1;
        while(opcion != 0) {
            System.out.println("1. agregar auto al dealer");
            System.out.println("2. mostrar auto del dealer");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            /*
            switch (opcion) {
                case 0 -> System.out.println("Saliendo");
                case 1 -> agregarAuto(dealer);
                case 2 -> dealer.showCars();
                default -> System.out.println("Opcion no valida");
            }*/

        }
    }

    public static void agregarAuto(Dealer dealer) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el VIN del auto: ");
        String vin = sc.nextLine();
        System.out.println("Ingrese la marca del auto: ");
        String brand = sc.nextLine();
        System.out.println("Ingrese el modelo del auto: ");
        String model = sc.nextLine();
        System.out.println("Ingrese el odometro del auto: ");
        int odometer = sc.nextInt();
        if(!vin.isEmpty() && !brand.isEmpty() && !model.isEmpty() && odometer >= 0) {
            Vehiculo car = new Vehiculo(vin, Brands.valueOf(brand), model, odometer);
            dealer.add(car);
        } else {
            System.out.println("Error al ingresar los datos del auto");
        }
    }

}
