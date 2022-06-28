import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Create a new dealer
        Dealer dealer = new Dealer();

        // Create the first car
        Car car1 = new Car("DASDAF1231", Brands.VOLKSWAGEN, "Bora", 162000);

        //Add the already created car (car1) to the Dealer's car inventory.
        dealer.addCar(car1);
        dealer.addCar(new Car("DASADSSA1", Brands.VOLKSWAGEN, "Polo", 162000));
        dealer.addCar(new Car("QQWE", Brands.MERCEDESBENZ, "1114", 1000));
        dealer.addCar(new Car("ZXCZXC", Brands.FIAT, "UNO", 2000));
        dealer.addCar(new Car("GHJGHJ", Brands.BMW, "Pato", 162000));
        dealer.addCar(new Car("TYUTYU", Brands.FIAT, "Fitito", 132000));

        // Show all the cars from the Dealer
        //dealer.showCars();

        // Print the car that has been found based on its VIN
//        System.out.println(dealer.findCar2(car -> car.getVin().equals("DASDAF1231")));
        // Print the car that has been found based on its model name.
//        System.out.println(dealer.findCar2(car -> car.getBrandName().equals(Brands.FIAT)));
//        Use predicate and declarative mood.
//        List<Car> cars_found  = (dealer.findCar2(car -> car.getBrandName().equals(Brands.FIAT)));

//        List<Car> cars_found  = (dealer.findCar(Brands.FIAT));

        Predicate<Car> predicateBrandName = car -> car.getBrandName().equals(Brands.FIAT);
        Predicate<Car> predicateModelName = car -> car.getModelName().equals("Fitito");

        List<Car> cars_found  = (dealer.findCar2(predicateBrandName.and(predicateModelName)));

        cars_found.forEach(car -> System.out.println(car.toString()) );
    }
}
