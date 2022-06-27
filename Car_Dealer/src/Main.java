public class Main {
    public static void main(String[] args) {
        // Create a new dealer
        Dealer dealer = new Dealer();

        // Create the first car
        Car car1 = new Car("DASDAF1231", Brands.VOLKSWAGEN, "Bora", 162000);

        //Add the already created car (car1) to the Dealer's car inventory.
        dealer.addCar(car1);
        dealer.addCar(new Car("DASADSSA1", Brands.VOLKSWAGEN, "Polo", 162000));

        // Show all the cars from the Dealer
        //dealer.showCars();

        // Print the car that has been found based on its VIN
        System.out.println(dealer.findCar2(car -> car.getVin().equals("DASDAF1231")));
        // Print the car that has been found based on its model name.
        System.out.println(dealer.findCar2(car -> car.getModelName().equals("Polo")));
    }
}
