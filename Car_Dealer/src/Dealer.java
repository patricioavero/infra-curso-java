import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
    public List<Car> findCar(Enum brand) {
        List<Car> cars_founds = new ArrayList<>();
        for (Car carFound : cars) {
            if (carFound.getBrandName().equals(brand))
                cars_founds.add(carFound);
        }
        return cars_founds;
    }

    // Method to find a car (Predicate + Lambda technique)
    public List<Car> findCar2(Predicate<Car> buscar) {
        return cars
                .stream()
                .filter(car -> buscar.test(car))
                .collect(Collectors.toList());
    }
}