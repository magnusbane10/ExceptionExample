package garage;

public class MainGarage {

    public static void main(String[] args) {

        Car car = new Car();
        Garage<Car> carGarage = new Garage<Car>(car);

        Boat boat = new Boat();
        Garage<Boat> boatGarage = new Garage<Boat>(boat);

        Truck truck = new Truck();
        Garage<Truck> truckGarage = new Garage<Truck>(truck);

        carGarage.repairVehicle();
        boatGarage.repairVehicle();

    }

}
