import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Dealer {
    private List<Vehiculo> vehiculos = new ArrayList<>();


    // Method to show all the cars in the Dealer's inventory
    public void listAll(Class<?> clazz) {
        switch (clazz.getSimpleName())
        {
            case "Car":
                vehiculos.stream().filter(getIsInstance(Car.class)).forEach(System.out::println);
                break;
            case "Moto":
                vehiculos.stream().filter(v -> v instanceof Moto).forEach(System.out::println);
                break;
            case "Vehiculo":
                vehiculos.forEach(System.out::println);
                break;
            default:
                System.out.println("No se encontro el tipo de vehiculo");
                break;
        }
    }

    private Predicate<Vehiculo> getIsInstance(Class<? extends Vehiculo> clazz) {
        return clazz::isInstance;
    }

    private Predicate<Vehiculo> getIsInstance2(Class<? extends Vehiculo> clazz) {
        return v -> clazz.isInstance(v);
    }

    public void listall2(Class<? extends  Vehiculo> clazz) {
      this.vehiculos.stream().filter(getIsInstance(clazz)).forEach(System.out::println);
    }

    // Method to add a car in the Dealer's inventory
    public void add(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Method to find a car (foreach technique)
    public List<Vehiculo> findVehiculo(Enum brand) {
        List<Vehiculo> vehiculosFound = new ArrayList<>();
        for (Vehiculo vehiculoFound : vehiculos) {
            if (vehiculoFound.getBrandName().equals(brand))
                vehiculosFound.add(vehiculoFound);
        }
        return vehiculosFound;
    }

    // Method to find a car (Predicate + Lambda technique)
    public List<Vehiculo> findVehiculo2(Predicate<Vehiculo> buscar) {
        return vehiculos
                .stream()
                .filter(vehiculo -> buscar.test(vehiculo))
                .collect(Collectors.toList());
    }

    public Vehiculo findMaxVehiculo() {
        return vehiculos
                .stream()
                .max(Comparator.comparingInt(Vehiculo::getOdometer))
                .get();
    }
}