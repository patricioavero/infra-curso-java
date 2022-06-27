import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Dealer {
    private List<Car> cars = new ArrayList<>();

    // Method to show all the cars in the Dealer's inventory
    public void showCars() {
        /*
        for (Car car : cars) {
            System.out.println(car);
        }
        */
        cars.forEach(car -> System.out.println(car));
    }

    // Method to add a car in the Dealer's inventory
    public void addCar(Car car) {
        cars.add(car);
    }

    // Method to find a car (foreach technique)
    public Car findCar(String vin) {
        for (Car carFound : cars) {
            if (carFound.getVin().equals(vin))
                return carFound;
            else
                System.out.println("The car with VIN: " + vin + "is not in our inventory.");
        }
        return null;
    }

    // Method to find a car (Predicate + Lambda technique)
    public Car findCar2(Predicate<Car> buscar) {
        return cars.stream().filter(car -> buscar.test(car)).findAny().get();
    }
}